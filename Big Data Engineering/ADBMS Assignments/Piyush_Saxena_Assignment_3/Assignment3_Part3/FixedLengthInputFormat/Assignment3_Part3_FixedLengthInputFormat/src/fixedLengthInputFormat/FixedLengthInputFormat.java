package fixedLengthInputFormat;

//package fixedLengthInputFormat;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.JobContext;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.io.compress.CompressionCodec;
import org.apache.hadoop.io.compress.CompressionCodecFactory;

public class FixedLengthInputFormat extends FileInputFormat{

	public static final String FIXED_RECORD_LENGTH = "mapreduce.input.fixedlengthinputformat.record.length";
	private int recordLength = -1;
	
	public static int getRecordLength(Configuration config) throws IOException {
        int recordLength = config.getInt(FixedLengthInputFormat.FIXED_RECORD_LENGTH, 502);
 
        // this would be an error
        if (recordLength == 0) {
            throw new IOException("FixedLengthInputFormat requires the Configuration property:" + FIXED_RECORD_LENGTH + " to" +
                    " be set to something > 0. Currently the value is 0 (zero)");
        }
 
        return recordLength;
    }
	
	@Override
    protected long computeSplitSize(long blockSize, long minSize, long maxSize) {
        long defaultSize = super.computeSplitSize(blockSize, minSize, maxSize);
 
        if (defaultSize <= recordLength){
        	return recordLength;
        }
 
        long splitSize = ((long)(Math.floor((double)defaultSize / (double)recordLength))) * recordLength;
        //LOG.info("FixedLengthInputFormat: calculated split size: " + splitSize);
        return splitSize;
    }
	
	@Override
    public RecordReader createRecordReader(InputSplit split,
            TaskAttemptContext context) throws IOException, InterruptedException {
        return new FixedLengthRecordReader();
    }
	
	@Override
    protected boolean isSplitable(JobContext context, Path file) {
 
        try {
            if (this.recordLength == -1) {
                this.recordLength = getRecordLength(context.getConfiguration());
            }
            
        } catch(Exception e) {
            return false;
        }
 
        CompressionCodec codec = new CompressionCodecFactory(context.getConfiguration()).getCodec(file);
        if (codec != null) {
            return false;
        }
 
        return true;
     }
}

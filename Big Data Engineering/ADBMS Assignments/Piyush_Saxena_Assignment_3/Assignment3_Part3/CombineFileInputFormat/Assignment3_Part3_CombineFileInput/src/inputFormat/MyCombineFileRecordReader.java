package inputFormat;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.CombineFileSplit;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;
import org.apache.hadoop.mapreduce.lib.input.LineRecordReader;

public class MyCombineFileRecordReader extends RecordReader<LongWritable,Text>{
	
	private LineRecordReader lineRecordReader = new LineRecordReader();
	
	public MyCombineFileRecordReader(CombineFileSplit split, TaskAttemptContext context, Integer index) 
            throws IOException{
            FileSplit fileSplit = new FileSplit(split.getPath(index),split.getOffset(index),
                    split.getLength(index), split.getLocations());
            lineRecordReader.initialize(fileSplit, context);
        }

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		lineRecordReader.close();
	}

	@Override
	public LongWritable getCurrentKey() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		return lineRecordReader.getCurrentKey();
	}

	@Override
	public Text getCurrentValue() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		return lineRecordReader.getCurrentValue();
	}

	@Override
	public float getProgress() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		return lineRecordReader.getProgress();
	}

	@Override
	public void initialize(InputSplit arg0, TaskAttemptContext arg1) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean nextKeyValue() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		return lineRecordReader.nextKeyValue();
	}

}

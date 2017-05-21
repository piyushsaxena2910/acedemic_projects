package assignment3_Part3_SequenceFileInputFormat;


import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.LongWritable;

public class SequenceInputFormatMainReducer extends Reducer<Text, LongWritable, Text, LongWritable> {

	@Override
	protected void reduce(Text key, Iterable<LongWritable> values, Context context)
			throws IOException, InterruptedException {

		LongWritable output = new LongWritable();
		long sum = 0;

		for (LongWritable val : values) {
			sum += val.get();
		}
		output.set(sum);
		context.write(key, output);
	}
}

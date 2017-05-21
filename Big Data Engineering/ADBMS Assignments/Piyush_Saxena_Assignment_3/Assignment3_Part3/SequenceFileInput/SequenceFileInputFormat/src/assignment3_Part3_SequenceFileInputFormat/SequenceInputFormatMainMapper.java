package assignment3_Part3_SequenceFileInputFormat;

import java.util.StringTokenizer;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.LongWritable;
import java.io.IOException;

public class SequenceInputFormatMainMapper extends Mapper<Text, Text, Text, LongWritable> {

	@Override
	public void map(Text key, Text value, Context context) throws IOException, InterruptedException {

		StringTokenizer itr = new StringTokenizer(value.toString());
		LongWritable one = new LongWritable(1L);
		Text word = new Text();
		while (itr.hasMoreTokens()) {
			word.set(itr.nextToken());
			context.write(word, one);

		}
	}
}
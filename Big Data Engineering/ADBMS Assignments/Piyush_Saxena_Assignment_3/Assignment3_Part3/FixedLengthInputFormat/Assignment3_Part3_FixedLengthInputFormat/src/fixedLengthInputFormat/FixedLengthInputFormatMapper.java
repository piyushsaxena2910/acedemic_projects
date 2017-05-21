package fixedLengthInputFormat;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class FixedLengthInputFormatMapper extends Mapper<LongWritable, Text, LongWritable, Text> {

	private Text word = new Text();

	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
		StringTokenizer itr = new StringTokenizer(value.toString(), ",");
		while (itr.hasMoreTokens()) {
			word.set(itr.nextToken());
			context.write(key, word);
		}
	}
}

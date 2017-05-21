package male_female_count;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class male_female_count_mapper extends Mapper<Object, Text, Text, IntWritable> {

	private final static IntWritable one = new IntWritable(1);

	@Override
	protected void map(Object key, Text value, Context context) throws IOException, InterruptedException {

		try {
			String[] tokens = value.toString().split("::");
			String gender = tokens[1].trim();
			context.write(new Text(gender), one);
		} catch (Exception e) {

		}
	}
}

package http_access;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class http_access_mapper extends Mapper<Object, Text, Text, IntWritable> {

	private final static IntWritable one = new IntWritable(1);

	@Override
	protected void map(Object key, Text value, Context context) throws IOException, InterruptedException {

		try {
			String[] tokens = value.toString().split(" - - ");
			String address = tokens[0].trim();
			context.write(new Text(address), one);
		} catch (Exception e) {

		}
	}
}

package movie_rating;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Movie_Rating_Mapper extends Mapper<Object, Text, Text, IntWritable> {

	private final static IntWritable one = new IntWritable(1);

	@Override
	protected void map(Object key, Text value, Context context) throws IOException, InterruptedException {

		String[] tokens = value.toString().split("::");

		String userId = tokens[0].trim();

		context.write(new Text(userId), one);

	}
}
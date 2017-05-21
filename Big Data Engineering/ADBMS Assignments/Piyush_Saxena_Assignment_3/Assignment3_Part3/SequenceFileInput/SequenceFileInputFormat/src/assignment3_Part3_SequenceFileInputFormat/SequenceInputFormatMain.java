package assignment3_Part3_SequenceFileInputFormat;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.SequenceFileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;

import java.io.IOException;

public class SequenceInputFormatMain {

	public static void main(String args[]) throws ClassNotFoundException {
		try {
			Configuration conf = new Configuration();
			Job job = Job.getInstance(conf, "Result");

			job.setJarByClass(SequenceInputFormatMain.class);
			job.setMapperClass(SequenceInputFormatMainMapper.class);
			job.setReducerClass(SequenceInputFormatMainReducer.class);
			job.setOutputKeyClass(Text.class);
			job.setOutputValueClass(LongWritable.class);
			job.setInputFormatClass(SequenceFileInputFormat.class);
			job.setOutputFormatClass(TextOutputFormat.class);
			job.setMapOutputKeyClass(Text.class);
			job.setMapOutputValueClass(LongWritable.class);
			FileInputFormat.addInputPath(job, new Path(args[0]));
			FileOutputFormat.setOutputPath(job, new Path(args[1]));
			System.exit(job.waitForCompletion(true) ? 0 : 1);
		} catch (IOException | InterruptedException e) {
			System.out.println("Error Message" + e.getMessage());
		}
	}
}

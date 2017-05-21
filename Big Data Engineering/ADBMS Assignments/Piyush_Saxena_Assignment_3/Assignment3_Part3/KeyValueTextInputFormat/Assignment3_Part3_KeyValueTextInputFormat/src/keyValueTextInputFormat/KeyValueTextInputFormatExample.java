package keyValueTextInputFormat;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.KeyValueTextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class KeyValueTextInputFormatExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		Configuration conf = new Configuration();
		conf.set("mapred.max.split.size", "1048576"); // 1MB
		conf.set("mapreduce.input.keyvaluelinerecordreader.key.value.separator", ",");

		Job job = new Job(conf, "Combine small files");
		job.setJarByClass(KeyValueTextInputFormatExample.class);

		job.setMapperClass(KeyValueTextMapper.class);
		job.setReducerClass(KeyValueTextReducer.class);

		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));

		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(Text.class);
		
		job.setInputFormatClass(KeyValueTextInputFormat.class);

		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}
}

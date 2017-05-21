package textInputFormat;

import java.io.IOException;

import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;


public class TextInputFormatMain {

	public static void main(String args[]) throws ClassNotFoundException {

        try {
            Configuration conf = new Configuration();
            Job job = Job.getInstance(conf, "Input Format");

            job.setJarByClass(TextInputFormatMain.class);
            job.setMapperClass(TextInputFormatMapper.class);
            job.setReducerClass(TextInputFormatReduce.class);
            job.setOutputKeyClass(Text.class);
            job.setOutputValueClass(IntWritable.class);
            job.setMapOutputKeyClass(Text.class);
            job.setMapOutputValueClass(IntWritable.class);

            FileInputFormat.addInputPath(job, new Path(args[0]));
            FileOutputFormat.setOutputPath(job, new Path(args[1]));
            System.exit(job.waitForCompletion(true) ? 0 : 1);
        } catch (IOException | InterruptedException e) {
            System.out.println("Error Message" + e.getMessage());
        }
    }
}

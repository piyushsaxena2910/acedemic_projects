package nLineInputFormat;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.NLineInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class Assignment3_Part3_NLineInputFormatMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        try {
            Configuration conf = new Configuration();
            Job job = Job.getInstance(conf, "wordCount");
            conf.setInt(NLineInputFormat.LINES_PER_MAP, 5);
            job.setJarByClass(Assignment3_Part3_NLineInputFormatMain.class);
            job.setMapperClass(Assignment3_Part3_NLineInputFormatMapper.class);
            job.setCombinerClass(Assignment3_Part3_NLineInputFormat_Reducer.class);
            job.setReducerClass(Assignment3_Part3_NLineInputFormat_Reducer.class);
            job.setOutputKeyClass(Text.class);
            job.setOutputValueClass(IntWritable.class);


            //job.setInputFormatClass(Assignment3_CombinedFileInputFormat.class);

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

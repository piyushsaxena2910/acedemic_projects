package sequenceFileGenerator;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.KeyValueTextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.SequenceFileOutputFormat;

public class SequenceFileGeneratorMain {

	public static void main(String args[]) throws IOException, ClassNotFoundException, InterruptedException {

	    Configuration conf=new Configuration();
	    Job job = new Job();
	    
	    job.setJarByClass(SequenceFileGeneratorMain.class);
	    job.setJobName("SequenceFileWriter");

	    FileInputFormat.addInputPath(job, new Path(args[0]));
	    FileOutputFormat.setOutputPath(job, new Path(args[1]));

	    job.setOutputKeyClass(Text.class);
	    job.setOutputValueClass(Text.class);

	    job.setInputFormatClass(KeyValueTextInputFormat.class);
	    job.setOutputFormatClass(SequenceFileOutputFormat.class);

	    job.setMapperClass(SequenceFileGeneratorMapper.class);
	    job.setNumReduceTasks(0);
	    
	    System.exit(job.waitForCompletion(true) ? 0 : 1);

	    if(job.isSuccessful()) {
	        System.out.println("Job was successful");
	    } else if(!job.isSuccessful()) {
	        System.out.println("Job was not successful");
	    }


	}
}

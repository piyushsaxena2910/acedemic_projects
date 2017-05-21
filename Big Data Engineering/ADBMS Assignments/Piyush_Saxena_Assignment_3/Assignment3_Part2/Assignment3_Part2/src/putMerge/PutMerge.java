package putMerge;

import java.io.IOException;
import java.util.Date;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class PutMerge {

	public static void main(String args[]) throws IOException, ClassNotFoundException, InterruptedException {

		long start = new Date().getTime();
		Configuration conf = new Configuration();
		FileSystem hdfs = FileSystem.get(conf);
		FileSystem local = FileSystem.getLocal(conf);

		Path inputDir = new Path(args[0]);
		Path hdfsFile = new Path(args[1]);

		try {
			FileStatus[] inputFiles = local.listStatus(inputDir);
			FSDataOutputStream out = hdfs.create(hdfsFile);

			for (int i = 0; i < inputFiles.length; i++) {
				System.out.println(inputFiles[i].getPath().getName());
				FSDataInputStream in = local.open(inputFiles[i].getPath());
				byte buffer[] = new byte[256];
				int bytesRead = 0;
				while ((bytesRead = in.read(buffer)) > 0) {
					out.write(buffer, 0, bytesRead);
				}
				in.close();
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Job job = Job.getInstance(conf, "average");
		job.setJarByClass(PutMerge.class);
		job.setMapperClass(PutMergeMapper.class);
		// job.setCombinerClass(PutMergeReducer.class);
		job.setReducerClass(PutMergeReducer.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(FloatWritable.class);
		FileInputFormat.addInputPath(job, hdfsFile);
		FileOutputFormat.setOutputPath(job, new Path(args[2]));
		boolean status = job.waitForCompletion(true);
		long end = new Date().getTime(); 
		System.out.println("Job took "+(end-start) + "milliseconds");
		System.exit(status ? 0 : 1);
	}
}

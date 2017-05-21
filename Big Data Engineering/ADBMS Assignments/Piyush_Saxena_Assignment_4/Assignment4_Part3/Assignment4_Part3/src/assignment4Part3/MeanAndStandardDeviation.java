package assignment4Part3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


public class MeanAndStandardDeviation {

	public static class StdDev extends Mapper<Object, Text, Text, DoubleWritable> {

		@Override
		protected void map(Object key, Text value, Context context) throws IOException, InterruptedException {
			// TODO Auto-generated method stub
			try {
				String row[] = value.toString().split("::");
				String movieId = row[1];
				String rating = row[2];

				double rat = Double.parseDouble(rating);
				context.write(new Text(movieId), new DoubleWritable(rat));
			} catch (Exception e) {

			}
		}
	}

	public static class StdReucer extends Reducer<Text, DoubleWritable, Text, MedianSDCustomWritable> {
		private MedianSDCustomWritable result = new MedianSDCustomWritable();
		private ArrayList<Double> list = new ArrayList<>();

		@Override
		protected void reduce(Text key, Iterable<DoubleWritable> values, Context context)
				throws IOException, InterruptedException {
			// TODO Auto-generated method stub

			double sum = 0;
			double count = 0;

			list.clear();
			result.setStddev(0);

			for (DoubleWritable val : values) {
				list.add(val.get());
				sum += val.get();
				count++;
			}

			Collections.sort(list);

			if (count % 2 == 0) {
				result.setMedian((list.get((int) count / 2) + list.get((int) count / 2 - 1)) / 2);
			} else {
				result.setMedian(list.get((int) count / 2));
			}

			double mean = sum / count;
			double sumOfSquares = 0;

			for (double val : list) {
				sumOfSquares += (val - mean) * (val - mean);
			}

			result.setStddev((double) Math.sqrt(sumOfSquares / (count - 1)));
			context.write(key, result);
		}

	}

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		Configuration conf1 = new Configuration();
		Job job = Job.getInstance(conf1, "Standard Deviation");
		job.setJarByClass(MeanAndStandardDeviation.class);
		job.setMapperClass(StdDev.class);
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(DoubleWritable.class);

		job.setReducerClass(StdReucer.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(MedianSDCustomWritable.class);

		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));

		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}
}

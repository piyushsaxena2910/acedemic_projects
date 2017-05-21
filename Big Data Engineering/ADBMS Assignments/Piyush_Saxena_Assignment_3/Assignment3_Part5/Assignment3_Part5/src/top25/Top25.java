package top25;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import top25.Top25;

public class Top25 {

	static int i = 0;
	public static class Ratings {

		float rating;
		String movieId;

		public String getMovieId() {
			return movieId;
		}

		public void setMovieId(String movieId) {
			this.movieId = movieId;
		}

		public float getRating() {
			return rating;
		}

		public void setRating(float rating) {
			this.rating = rating;
		}

		public Ratings(float rating, String movieId) {
			this.rating = rating;
			this.movieId = movieId;
		}
	}

	public static class RatingsComparator extends WritableComparator {

		public RatingsComparator() {
			super(FloatWritable.class, true);
		}

		@Override
		public int compare(WritableComparable wc1, WritableComparable wc2) {
			FloatWritable fw1 = (FloatWritable) wc1;
			FloatWritable fw2 = (FloatWritable) wc2;
			int cmp = -1 * fw1.compareTo(fw2);
			return cmp;
		}
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		Configuration conf1 = new Configuration();
		Job job1 = Job.getInstance(conf1, "chaining");
		job1.setJarByClass(Top25.class);
		job1.setMapperClass(Map1.class);
		job1.setMapOutputKeyClass(Text.class);
		job1.setMapOutputValueClass(FloatWritable.class);

		job1.setReducerClass(Reduce1.class);
		job1.setOutputKeyClass(Text.class);
		job1.setOutputValueClass(FloatWritable.class);

		FileInputFormat.addInputPath(job1, new Path(args[0]));
		FileOutputFormat.setOutputPath(job1, new Path(args[1]));
		boolean complete = job1.waitForCompletion(true);
		// System.exit(job1.waitForCompletion(true) ? 0 : 1);

		Configuration conf2 = new Configuration();
		Job job2 = Job.getInstance(conf2, "chaining");
		if (complete) {
			job2.setJarByClass(Top25.class);
			job2.setMapperClass(Map2.class);
			job2.setMapOutputKeyClass(FloatWritable.class);
			job2.setMapOutputValueClass(Text.class);

			job2.setSortComparatorClass(RatingsComparator.class);
			job2.setReducerClass(Reduce2.class);
			job2.setOutputKeyClass(Text.class);
			job2.setOutputValueClass(FloatWritable.class);

			FileInputFormat.addInputPath(job2, new Path(args[1]));
			FileOutputFormat.setOutputPath(job2, new Path(args[2]));
			System.exit(job2.waitForCompletion(true) ? 0 : 1);
		}

	}

	public static class Map1 extends Mapper<LongWritable, Text, Text, FloatWritable> {

		public void map(LongWritable key, Text value, Context context) {
			String row[] = value.toString().split("::");
			String movieId = row[1];

			String rating = row[2].trim();
			try {
				FloatWritable ratings = new FloatWritable(Float.parseFloat(rating));
				context.write(new Text(movieId), ratings);
			} catch (Exception e) {

			}
		}
	}

	public static class Reduce1 extends Reducer<Text, FloatWritable, Text, FloatWritable> {

		private FloatWritable averageRating = new FloatWritable();

		public void reduce(Text key, Iterable<FloatWritable> values, Context context)
				throws IOException, InterruptedException {
			float sum = 0;
			float counter = 0;
			for (FloatWritable val : values) {
				sum += val.get();
				counter++;
			}
			averageRating.set(sum / counter);
			context.write(key, averageRating);
		}
	}

	public static class Map2 extends Mapper<LongWritable, Text, FloatWritable, Text> {

		public void map(LongWritable key, Text value, Context context) {
			String row[] = value.toString().split("\\t");
			Text movieId = new Text(row[0]);
			String averageRating = row[1].trim();

			try {
				FloatWritable count = new FloatWritable(Float.parseFloat(averageRating));
				context.write(count, movieId);

			} catch (

			Exception e) {

			}
		}
	}

	public static class Reduce2 extends Reducer<FloatWritable, Text, Text, FloatWritable> {

		public void reduce(FloatWritable key, Iterable<Text> value, Context context)
				throws IOException, InterruptedException {
			
			if (i < 25) {
				for (Text val : value) {
					context.write(val, key);
					i++;
				}
			}
		}
	}
}

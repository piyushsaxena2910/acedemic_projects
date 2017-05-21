package assignment4Part4;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.SortedMapWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class MeanAndStandardDDeviationMemoryManaged {

	public static class StdDev extends Mapper<Object, Text, IntWritable, SortedMapWritable> {

		private static final LongWritable ONE = new LongWritable(1);
		
		@Override
		protected void map(Object key, Text value, Context context) throws IOException, InterruptedException {
			// TODO Auto-generated method stub
			try {
				String row[] = value.toString().split("::");
				String movieId = row[1];
				String rating = row[2];

				SortedMapWritable outRatings = new SortedMapWritable();
				outRatings.put(new FloatWritable(Float.parseFloat(rating)), ONE);

				context.write(new IntWritable(Integer.parseInt(movieId)), outRatings);
			} catch (Exception e) {

			}
		}
	}

	public static class StdCombiner extends Reducer<IntWritable, SortedMapWritable, IntWritable, SortedMapWritable> {

		@Override
	    protected void reduce(IntWritable key, Iterable<SortedMapWritable> values, Context context) throws IOException, InterruptedException {
	        SortedMapWritable outValue = new SortedMapWritable();

	        for(SortedMapWritable val:values)
	        {
	            for(Map.Entry<WritableComparable,Writable> entry : val.entrySet())
	            {
	                LongWritable count = (LongWritable) outValue.get(entry.getKey());

	                if(count!=null)
	                {
	                    count.set(count.get()+((LongWritable) entry.getValue()).get());
	                }
	                else
	                {
	                    outValue.put(entry.getKey(), new LongWritable(((LongWritable) entry.getValue()).get()));
	                }
	            }
	            val.clear();
	        }

	        context.write(key,outValue);
	    }
	}

	public static class StdReucer extends Reducer<IntWritable, SortedMapWritable, IntWritable, MedianSDCustomWritable> {
		
		private MedianSDCustomWritable result = new MedianSDCustomWritable();
	    private TreeMap<Float,Long> ratingCounts= new TreeMap<Float,Long>();

	    @Override
	    public void reduce(IntWritable key, Iterable<SortedMapWritable> values,Context context ) throws IOException, InterruptedException {
	        float sum=0;

	        long totalRatings=0;

	        ratingCounts.clear();

	        result.setStddev(0);
	        result.setMedian(0);

	        for(SortedMapWritable val : values)
	        {
	            for(Map.Entry<WritableComparable,Writable> entry : val.entrySet())
	            {
	                float length = ((FloatWritable) entry.getKey()).get();
	                long count = ((LongWritable) entry.getValue()).get();

	                totalRatings += count;
	                sum += length*count;

	                Long storedCount = ratingCounts.get(length);
	                if(storedCount == null)
	                {
	                    ratingCounts.put(length,count);

	                }
	                else
	                {
	                    ratingCounts.put(length,storedCount+count);
	                }
	            }
	        }


	        long medianIndex = totalRatings/2L;
	        long previousRatings=0;
	        long ratings=0;
	        float prevKey=0;

	        for(Map.Entry<Float,Long> entry : ratingCounts.entrySet())
	        {
	            ratings=previousRatings+entry.getValue();

	            if(previousRatings<=medianIndex && medianIndex < ratings)
	            {
	                if(totalRatings % 2 == 0 && previousRatings == medianIndex)
	                {
	                    result.setMedian((float)(entry.getKey()+prevKey)/2.0f);
	                }
	                else
	                {
	                    result.setMedian(entry.getKey());
	                }
	                break;
	            }
	             previousRatings=ratings;
	            prevKey=entry.getKey();
	        }

	        float mean =sum/totalRatings;

	        float sumOfSquares=0;

	        for(Map.Entry<Float,Long> entry : ratingCounts.entrySet())
	        {
	            sumOfSquares += (entry.getKey()-mean) * (entry.getKey()-mean);
	            entry.getValue();
	        }
	        result.setStddev((float) Math.sqrt(sumOfSquares)/(totalRatings -1));
	        context.write(key,result);
	    }

	}

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		Configuration conf1 = new Configuration();
		Job job = Job.getInstance(conf1, "Standard Deviation Memory Managed");
		job.setJarByClass(MeanAndStandardDDeviationMemoryManaged.class);
		job.setMapperClass(StdDev.class);
		job.setMapOutputKeyClass(IntWritable.class);
		job.setMapOutputValueClass(SortedMapWritable.class);
		
		job.setCombinerClass(StdCombiner.class);

		job.setReducerClass(StdReucer.class);
		job.setOutputKeyClass(IntWritable.class);
		job.setOutputValueClass(MedianSDCustomWritable.class);

		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));

		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}
}

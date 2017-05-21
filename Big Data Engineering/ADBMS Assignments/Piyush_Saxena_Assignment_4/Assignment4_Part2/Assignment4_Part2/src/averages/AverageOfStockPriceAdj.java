package averages;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class AverageOfStockPriceAdj {

	public static class AverageMapper extends Mapper<Object, Text, IntWritable, CountAverageTuple> {

		private IntWritable outYear = new IntWritable();
		private CountAverageTuple outCountAverage = new CountAverageTuple();
		private final static SimpleDateFormat frmt = new SimpleDateFormat("yyyy-MM-dd");
		private final Calendar c = Calendar.getInstance();

		@Override
		protected void map(Object key, Text value, Context context) throws IOException, InterruptedException {
			// TODO Auto-generated method stub

			String row[] = value.toString().split(",");

			if (row[1].equals("stock_symbol")) {

			} else {
				try {

					String strDate = row[2];
					String stockPriceAdjClose = row[8];

					Date creationDate = frmt.parse(strDate);
					c.setTime(creationDate);
					outYear.set(c.get(Calendar.YEAR));

					outCountAverage.setCount(1);
					outCountAverage.setAverages(Double.parseDouble(stockPriceAdjClose));

					context.write(outYear, outCountAverage);
				} catch (Exception e) {

				}
			}
		}
	}

	public static class AverageReducer extends Reducer<IntWritable, CountAverageTuple, IntWritable, CountAverageTuple> {

		private CountAverageTuple result = new CountAverageTuple();

		@Override
		protected void reduce(IntWritable key, Iterable<CountAverageTuple> values, Context context)
				throws IOException, InterruptedException {
			// TODO Auto-generated method stub

			double sum = 0;
			double count = 0;

			for (CountAverageTuple val : values) {
				sum += val.getCount() * val.getAverages();
				count += val.getCount();
			}

			result.setCount(count);
			result.setAverages(sum / count);

			context.write(key, result);
		}

	}

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		Configuration conf = new Configuration();
		Job job = Job.getInstance(conf, "Average with Combiner");
		job.setJarByClass(AverageOfStockPriceAdj.class);
		job.setMapperClass(AverageMapper.class);
		job.setMapOutputKeyClass(IntWritable.class);
		job.setMapOutputValueClass(CountAverageTuple.class);

		job.setReducerClass(AverageReducer.class);
		job.setOutputKeyClass(IntWritable.class);
		job.setOutputValueClass(CountAverageTuple.class);
		
		job.setCombinerClass(AverageReducer.class);

		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));

		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}
}

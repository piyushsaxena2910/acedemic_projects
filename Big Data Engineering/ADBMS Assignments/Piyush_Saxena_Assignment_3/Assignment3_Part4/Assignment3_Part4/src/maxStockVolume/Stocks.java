package maxStockVolume;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class Stocks {

	public static class MinMaxMapper extends Mapper<Object, Text, Text, StockWritable> {

		Date stringDate = new Date();
		private Text stockSymbol = new Text();
		private StockWritable output = new StockWritable();
		private final static SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd");

		public void map(Object key, Text value, Context context) throws IOException, InterruptedException {

			String line = value.toString();
			String val[] = line.split(",");
			if (val[1].equals("stock_symbol")) {
			} else {
				try {
					stringDate = sfd.parse(val[2]);
					stockSymbol = new Text(val[1]);
					output.setMinStockVolume(Double.parseDouble(val[7]));
					output.setMaxStockVolume(Double.parseDouble(val[7]));
					output.setStockAdjClose(Double.parseDouble(val[8]));
					output.setMinDate(stringDate);
					output.setMaxDate(stringDate);
					context.write(stockSymbol, output);
				} catch (ParseException ex) {
				}
			}
		}
	}

	public static class MinMaxReducer extends Reducer<Text, StockWritable, Text, StockWritable> {

		private StockWritable result = new StockWritable();

		public void reduce(Text key, Iterable<StockWritable> values, Context context)
				throws IOException, InterruptedException {

			result.setMinStockVolume(0);
			result.setMaxStockVolume(0);
			result.setStockAdjClose(0);
			result.setMinDate(null);
			result.setMaxDate(null);
			
			for (StockWritable value : values) {
				if (result.getMinDate() == null || value.compareTo(result) < 0) {
					result.setMinDate(value.getMinDate());
					result.setMinStockVolume(value.getMinStockVolume());
				}
				if (result.getMaxDate() == null || value.compareTo1(result) > 0) {
					result.setMaxDate(value.getMaxDate());
					result.setMaxStockVolume(value.getMaxStockVolume());

				}
				if (value.getStockAdjClose() > result.getStockAdjClose()) {
					result.setStockAdjClose(value.getStockAdjClose());
				}
			}
			context.write(key, result);
		}
	}

	public static class MinMaxCombiner extends Reducer<Text, StockWritable, Text, StockWritable> {

		private StockWritable result = new StockWritable();

		public void reduce(Text key, Iterable<StockWritable> values, Context context)
				throws IOException, InterruptedException {

			result.setMinDate(null);
			result.setMaxDate(null);
			result.setMinStockVolume(0);
			result.setMaxStockVolume(0);
			result.setStockAdjClose(0);

			for (StockWritable value : values) {
				if (result.getMinDate() == null || value.compareTo(result) < 0) {
					result.setMinDate(value.getMinDate());
					result.setMinStockVolume(value.getMinStockVolume());
				}
				if (result.getMaxDate() == null || value.compareTo1(result) > 0) {
					result.setMaxDate(value.getMaxDate());
					result.setMaxStockVolume(value.getMaxStockVolume());
				}
				if (value.getStockAdjClose() > result.getStockAdjClose()) {
					result.setStockAdjClose(value.getStockAdjClose());
				}
			}
			context.write(key, result);
		}
	}

	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		Job job = Job.getInstance(conf, "Stock Volume Date Calculation");
		job.setJarByClass(Stocks.class);
		job.setMapperClass(MinMaxMapper.class);
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(StockWritable.class);
		
		job.setCombinerClass(MinMaxCombiner.class);
		
		job.setReducerClass(MinMaxReducer.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(StockWritable.class);
		
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}
}

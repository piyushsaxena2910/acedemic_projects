package putMerge;

import java.io.IOException;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class PutMergeReducer extends Reducer<Text, FloatWritable, Text, FloatWritable> {

	private FloatWritable result = new FloatWritable();

	@Override
	protected void reduce(Text key, Iterable<FloatWritable> values, Context context) throws IOException, InterruptedException {
		
		System.out.println("Inside the Reducer");
		float sum = 0;
		float count = 0;
		for(FloatWritable val : values){
			sum += val.get();
			count++;
		}
		System.out.println(sum);
		System.out.println(count);
		//Logger.
		result.set(sum/count);
		context.write(key, result);
	}

}

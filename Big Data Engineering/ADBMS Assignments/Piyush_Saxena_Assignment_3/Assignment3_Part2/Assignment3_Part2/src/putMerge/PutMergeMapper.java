package putMerge;

import java.io.IOException;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class PutMergeMapper  extends Mapper<Object, Text, Text, FloatWritable> {
	
	@Override
    protected void map(Object key, Text value, Context context)
            throws IOException, InterruptedException {

		System.out.println("Inside the Mapper");
        //StringTokenizer itr = new StringTokenizer(value.toString(),",");
        String[] tokens=value.toString().split(",");
        try {
        String stock_type = tokens[1].trim();
        float number = Float.parseFloat(tokens[4].trim());



            context.write(new Text(stock_type), new FloatWritable(number));
        }
        catch (Exception e)
        {

        }
    }

}

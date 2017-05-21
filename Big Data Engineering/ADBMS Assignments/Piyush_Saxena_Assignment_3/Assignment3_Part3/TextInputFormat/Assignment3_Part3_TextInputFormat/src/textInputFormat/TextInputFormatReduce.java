package textInputFormat;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class TextInputFormatReduce extends Reducer<Text, IntWritable, Text, IntWritable> {

    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
        IntWritable output = new IntWritable();
        int sum = 0;
        for(IntWritable val : values){
            sum += val.get();
        }
        output.set(sum);
        context.write(key, output);
    }
}
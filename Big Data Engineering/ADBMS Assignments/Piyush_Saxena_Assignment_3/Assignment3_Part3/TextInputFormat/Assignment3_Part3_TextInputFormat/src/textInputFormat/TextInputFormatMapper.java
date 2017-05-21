package textInputFormat;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class TextInputFormatMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

        StringTokenizer itr = new StringTokenizer(value.toString());
        IntWritable one = new IntWritable();
        Text word = new Text();
        while (itr.hasMoreTokens()) {
            word.set(itr.nextToken());
            context.write(word, one);

        }

    }
}

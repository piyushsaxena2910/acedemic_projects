package fixedLengthInputFormat;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class FixedLengthInputFormatReducer extends Reducer<LongWritable,Text,LongWritable,Text>{

	private Text result = new Text();
    public void reduce(LongWritable key, Iterable<Text> values,
    Context context
    ) throws IOException, InterruptedException
    {
        String translations = "";
        for (Text val : values)
        {
            translations += "|"+val.toString();
        }
        result.set(translations);
        context.write(key, result);
    }
}

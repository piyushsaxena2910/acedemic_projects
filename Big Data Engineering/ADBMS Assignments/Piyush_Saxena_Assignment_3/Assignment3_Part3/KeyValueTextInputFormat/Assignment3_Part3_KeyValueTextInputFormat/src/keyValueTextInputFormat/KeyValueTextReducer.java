package keyValueTextInputFormat;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class KeyValueTextReducer extends Reducer<Text,Text,Text,Text>{

	private Text result = new Text();
    public void reduce(Text key, Iterable<Text> values,
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

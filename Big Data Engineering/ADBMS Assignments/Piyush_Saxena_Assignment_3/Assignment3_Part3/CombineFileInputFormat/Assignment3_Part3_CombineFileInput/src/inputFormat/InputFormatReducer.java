package inputFormat;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class InputFormatReducer extends Reducer<Text, Text, Text, Text>{

	@Override
	protected void reduce(Text key, Iterable<Text> value, Context context) throws IOException, InterruptedException {
		
		for (Text values : value){
            context.write(key, values);
        }
	}
}

package averages;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.Writable;

public class CountAverageTuple implements Writable {

	private double averages;
	private double count;
	
	public double getAverages() {
		return averages;
	}
	
	public void setAverages(double averages) {
		this.averages = averages;
	}
	
	public double getCount() {
		return count;
	}
	
	public void setCount(double count) {
		this.count = count;
	}
	
	@Override
	public void readFields(DataInput di) throws IOException {
		count = di.readDouble();
		averages = di.readDouble();
		
	}
	
	@Override
	public void write(DataOutput d) throws IOException {
		d.writeDouble(count);
		d.writeDouble(averages);
	}
	
	@Override
	public String toString() {
		return (this.getCount() + "\t" + this.getAverages());
	}
	
	
}

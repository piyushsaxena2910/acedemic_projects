package assignment4Part3;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.Writable;

public class MedianSDCustomWritable implements Writable {

	private double median;
	private double stddev;
	
	public double getMedian() {
		return median;
	}
	public void setMedian(double median) {
		this.median = median;
	}
	public double getStddev() {
		return stddev;
	}
	public void setStddev(double stddev) {
		this.stddev = stddev;
	}
	
	@Override
	public void readFields(DataInput di) throws IOException {
		median = di.readDouble();
		stddev = di.readDouble();
	}
	
	@Override
	public void write(DataOutput d) throws IOException {
		d.writeDouble(median);
		d.writeDouble(stddev);
	}
	
	@Override
	public String toString() {
		return (this.getMedian() + "\t" + this.getStddev());
	}
}

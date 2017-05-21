package maxStockVolume;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Date;

import org.apache.hadoop.io.Writable;

public class StockWritable implements Comparable<StockWritable>, Writable {

	private double minStockVolume;
	private double maxStockVolume;
	private double stockAdjClose;
	private Date minDate = new Date();
	private Date maxDate = new Date();

	public Date getMinDate() {
		return minDate;
	}

	public void setMinDate(Date min) {
		this.minDate = min;
	}

	public Date getMaxDate() {
		return maxDate;
	}

	public void setMaxDate(Date max) {
		this.maxDate = max;
	}

	public double getMinStockVolume() {
		return minStockVolume;
	}

	public void setMinStockVolume(double minStockVolume) {
		this.minStockVolume = minStockVolume;
	}

	public double getMaxStockVolume() {
		return maxStockVolume;
	}

	public void setMaxStockVolume(double maxStockVolume) {
		this.maxStockVolume = maxStockVolume;
	}

	public double getStockAdjClose() {
		return stockAdjClose;
	}

	public void setStockAdjClose(double stockAdjClose) {
		this.stockAdjClose = stockAdjClose;
	}

	@Override
	public void readFields(DataInput input) throws IOException {
		minStockVolume = input.readDouble();
		maxStockVolume = input.readDouble();
		stockAdjClose = input.readDouble();
		minDate = new Date(input.readLong());
		maxDate = new Date(input.readLong());
	}

	@Override
	public void write(DataOutput output) throws IOException {
		output.writeDouble(minStockVolume);
		output.writeDouble(maxStockVolume);
		output.writeDouble(stockAdjClose);
		output.writeLong(minDate.getTime());
		output.writeLong(maxDate.getTime());
	}

	@Override
	public int compareTo(StockWritable sw) {
		if (this.maxStockVolume < sw.getMaxStockVolume()) {
			return -1;
		} else if (this.maxStockVolume > sw.getMaxStockVolume()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public int compareTo1(StockWritable sw) {
        if(this.maxStockVolume < sw.getMaxStockVolume()){
            return -1;
        }
        else if(this.maxStockVolume > sw.getMaxStockVolume()){
            return 1;
        } else{
            return 0;
        }
    }
	
	@Override
    public String toString() {
        return (this.getMinDate() + "\t" + this.getMaxDate() + "\t" + this.getStockAdjClose());
    }

}

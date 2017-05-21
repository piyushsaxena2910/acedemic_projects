package com.pojo;

public class Costs {
	
	private double deductibles;
	private double copay;
	private String costId;
	
	public Costs(){
		
	}

	public double getDeductibles() {
		return deductibles;
	}

	public void setDeductibles(double deductibles) {
		this.deductibles = deductibles;
	}

	public double getCopay() {
		return copay;
	}

	public void setCopay(double copay) {
		this.copay = copay;
	}

	@Override
	public String toString() {
		return "[deductibles=" + deductibles + ", copay=" + copay + ", costId=" + costId + "]";
	}

	public String getCostId() {
		return costId;
	}

	public void setCostId(String costId) {
		this.costId = costId;
	}
	
}

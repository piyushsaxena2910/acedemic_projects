package com.pojo;

import java.util.Arrays;

public class Plans {

	private Services[] services;
	private String planId;
	private Costs[] costs;
	
	public Plans(){
		
	}

	@Override
	public String toString() {
		return "Plans [services=" + Arrays.toString(services) + ", planId=" + planId + ", costs="
				+ Arrays.toString(costs) + "]";
	}
	
	public Services[] getServices() {
		return services;
	}

	public void setServices(Services[] services) {
		this.services = services;
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public Costs[] getCosts() {
		return costs;
	}

	public void setCosts(Costs[] costs) {
		this.costs = costs;
	}
	
}

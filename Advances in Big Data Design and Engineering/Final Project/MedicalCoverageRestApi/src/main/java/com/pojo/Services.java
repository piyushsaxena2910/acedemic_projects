package com.pojo;

public class Services {
	
	private String serviceId;
	private String serviceName;
	
	public Services(){
		
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	@Override
	public String toString() {
		return "[serviceId=" + serviceId + ", serviceName=" + serviceName + "]";
	}
	
	
}

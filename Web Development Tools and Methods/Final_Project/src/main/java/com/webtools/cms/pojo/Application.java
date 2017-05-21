package com.webtools.cms.pojo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="application")

public class Application {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="applicationID", unique = true, nullable = false)
	private int applicationID;
	
	@Column(name="applicationName",unique=true)
	private String applicationName;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="application")
	private Set<Page> pages = new HashSet<Page>();
	
	@Column(name="flow")
	private String flow;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="productCatalog")
	private ProductCatalog productCatalog;
	
	public Application(){}
	
	
	public Application(String applicationName) {
        this.applicationName = applicationName;
    }

	public int getApplicationID() {
		return applicationID;
	}

	public void setApplicationID(int applicationID) {
		this.applicationID = applicationID;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public Set<Page> getPages() {
		return pages;
	}

	public void setPages(Set<Page> pages) {
		this.pages = pages;
	}

	public String getFlow() {
		return flow;
	}

	public void setFlow(String flow) {
		this.flow = flow;
	}

	
	public ProductCatalog getProductCatalog() {
		return productCatalog;
	}


	public void setProductCatalog(ProductCatalog productCatalog) {
		this.productCatalog = productCatalog;
	}


	@Override
	public String toString() {
		return applicationName;
	}
}

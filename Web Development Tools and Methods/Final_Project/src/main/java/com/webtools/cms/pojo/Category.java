package com.webtools.cms.pojo;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {

	public Category(){}
	
	@Id @GeneratedValue(strategy = IDENTITY)
	@Column(name="categoryID", unique = true, nullable = false)
	private int categoryID;
	
	@Column(name="categoryName")
	private String categoryName;
	
	@Column(name="categoryValue")
	private String categoryValue;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="productID")
	private Product product;
	
	@Column(name="categoryLogo")
	private String categoryLogo;
	
	@Column(name="valueLogo")
	private String valueLogo;

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryValue() {
		return categoryValue;
	}

	public void setCategoryValue(String categoryValue) {
		this.categoryValue = categoryValue;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getCategoryLogo() {
		return categoryLogo;
	}

	public void setCategoryLogo(String categoryLogo) {
		this.categoryLogo = categoryLogo;
	}

	public String getValueLogo() {
		return valueLogo;
	}

	public void setValueLogo(String valueLogo) {
		this.valueLogo = valueLogo;
	}

	@Override
	public String toString() {
		return categoryName;
	}
	
}

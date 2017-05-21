package com.webtools.cms.pojo;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	@Id @GeneratedValue(strategy = IDENTITY)
	@Column(name="productID", unique = true, nullable = false)
	private int productID;
	
	@Column(name="productName",unique=true)
	private String productName;
	
	@Column(name="productPrice")
	private String productPrice;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="product")
	private Set<Category> category = new HashSet<Category>();
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="productCatalogID")
	private ProductCatalog productCatalogForProducts;

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public Set<Category> getCategory() {
		return category;
	}

	public void setCategory(Set<Category> category) {
		this.category = category;
	}

	public ProductCatalog getProductCatalogForProducts() {
		return productCatalogForProducts;
	}

	public void setProductCatalogForProducts(ProductCatalog productCatalogForProducts) {
		this.productCatalogForProducts = productCatalogForProducts;
	}
	@Override
	public String toString() {
		return productName;
	}
}

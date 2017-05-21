package com.webtools.cms.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="productCatalog")
public class ProductCatalog {
	
	@Id @GeneratedValue
	@Column(name="productCatalogID", unique = true, nullable = false)
	private int productCatalogID;

	@OneToMany(fetch=FetchType.LAZY, mappedBy="productCatalogForProducts")
	private Set<Product> products = new HashSet<Product>();
	
	public ProductCatalog(){}

	public int getProductCatalogID() {
		return productCatalogID;
	}

	public void setProductCatalogID(int productCatalogID) {
		this.productCatalogID = productCatalogID;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return String.valueOf(productCatalogID);
	}
	
}

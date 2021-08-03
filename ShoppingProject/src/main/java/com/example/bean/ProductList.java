package com.example.bean;

import java.util.List;


public class ProductList {

	private List<Product> productList;

	public ProductList() {
		super();
	}

	public ProductList(List<Product> list) {
		super();
		this.productList = list;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	
	
}

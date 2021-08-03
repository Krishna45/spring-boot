package com.example.persistence;

import java.util.List;

import com.example.bean.Product;

public interface ProductDao {

	public List<Product> findAllProduct();
	public Product findProductByCode(String code);
	
}

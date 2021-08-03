package com.example.service;

import java.util.List;

import com.example.bean.Product;

public interface ProductService {

	List<Product> getAllProduct();
	Product getProductByCode(String code);
	
}

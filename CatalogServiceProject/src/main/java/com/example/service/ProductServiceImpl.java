package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Product;
import com.example.persistence.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<Product> getAllProduct() {
		
		return productDao.findAllProduct();
		
	}

	@Override
	public Product getProductByCode(String code) {
		
		return productDao.findProductByCode(code);
		
	}

}

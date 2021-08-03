package com.example.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Product;
import com.example.service.ProductService;

@RestController
public class CatalogController {

	@Autowired
	private ProductService productService;
	
	@GetMapping(path="/products", produces="application/json")
	public List<Product> getAll()
	{
		return productService.getAllProduct();
	}
	
	@GetMapping(path="/products/{code}", produces="application/json")
	public Product getByCode(@PathVariable("code") String code)
	{
		return productService.getProductByCode(code);
	}
	
}

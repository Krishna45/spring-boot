package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.bean.InventoryItem;
import com.example.bean.Product;
import com.example.bean.ProductList;
import com.example.bean.Shopping;

@Service
public class ShoppingServiceImpl implements ShoppingService {

	@Autowired
	RestTemplate restTemplate;

	@Override
	public List<Shopping> getAllProducts() {
		ProductList plist=restTemplate.getForObject("http://localhost:8095/products/",ProductList.class);
		List<Shopping> list=new ArrayList<Shopping>();
		Shopping shopping=null;
		for(Product product: plist.getProductList()) 
		{ 
			InventoryItem item=restTemplate.getForObject("http://localhost:8076/inventory/id/"+product. getId() ,InventoryItem.class); 
			shopping=new Shopping( product.getId(),
					product.getCode(), product.getName(), product.getDescription(),
					product.getPrice(), item.getProductionCode(), item.getAvailabelQuantity());
			list.add(shopping);
		} 
		return list;
	}
	
	

}
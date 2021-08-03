package com.example.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.bean.Product;
import com.example.helper.ProductRowMapper;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
    private JdbcTemplate jdbcTemplate;	
	
	@Override
	public List<Product> findAllProduct() {
	
		List<Product> product=jdbcTemplate.query("select * from Product",new ProductRowMapper());
		return product;
	}

	@Override
	public Product findProductByCode(String code) {
		
		Object ob[]= {code};
		Product product=jdbcTemplate.queryForObject("select * from Product where Code=?",ob,new ProductRowMapper());
		return product;
	}

}

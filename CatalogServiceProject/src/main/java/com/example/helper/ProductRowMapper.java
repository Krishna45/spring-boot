package com.example.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.bean.Product;

public class ProductRowMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Product product=new Product();
		product.setId(rs.getLong("Id"));
		product.setCode(rs.getString("Code"));
		product.setName(rs.getString("Name"));
		product.setDescription(rs.getString("Description"));
		product.setPrice(rs.getDouble("Price"));
		return product;
		
	}

	
	
}

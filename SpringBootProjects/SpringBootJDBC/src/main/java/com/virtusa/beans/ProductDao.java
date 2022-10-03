package com.virtusa.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
@Service
public class ProductDao {
	@Autowired
		JdbcTemplate template;
	
	public void save(Product product) {
		String sql="insert into  product1(id,name) values(?,?)";
		template.update(sql,product.getId(),product.getProductname());
	}
	
}

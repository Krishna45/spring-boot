package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.bean.Order;
import com.example.bean.OrderItem;
import com.example.persistence.OrderServiceDao;

@SpringBootApplication(scanBasePackages = "com.example")
@EntityScan(basePackages = "com.example.bean")
@EnableJpaRepositories(basePackages = "com.example.persistence")
public class OrderServiceProjectApplication{

	
	public static void main(String[] args) {
		SpringApplication.run(OrderServiceProjectApplication.class, args);
	}
	/*
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * List<OrderItem> li=new ArrayList<OrderItem>(); li.add(new OrderItem(1,101, 5,
	 * 20)); li.add(new OrderItem(2,102, 10, 25)); li.add(new OrderItem(3,103, 8,
	 * 30)); li.add(new OrderItem(4,104, 2, 35)); li.add(new OrderItem(5,105, 4,
	 * 40)); osDao.save(new Order(1,"abcde@gmail.com","UP",li));
	 * 
	 * }
	 */

}

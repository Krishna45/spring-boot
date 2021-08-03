package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.bean.InventoryItem;
import com.example.persistence.InventoryDao;

@SpringBootApplication(scanBasePackages = "com.example")
@EntityScan(basePackages = "com.example.bean")
@EnableJpaRepositories(basePackages = "com.example.persistence")
public class InventoryServiceProjectApplication{
	
	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceProjectApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * inventoryDao.save(new InventoryItem("P101",10)); inventoryDao.save(new
	 * InventoryItem("P102",50)); inventoryDao.save(new InventoryItem("P103",20));
	 * inventoryDao.save(new InventoryItem("P104",40)); inventoryDao.save(new
	 * InventoryItem("P105",30)); }
	 */
}

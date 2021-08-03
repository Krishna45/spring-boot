package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.example.bean.Rating;
import com.example.persistence.RatingDao;

@SpringBootApplication(scanBasePackages = "com.example")
@EntityScan(basePackages = "com.example.bean")
@EnableJpaRepositories(basePackages = "com.example.persistence")
public class RatingDataProjectApplication{
    

	
	public static void main(String[] args)  {
		SpringApplication.run(RatingDataProjectApplication.class, args);
	}

	
	 
	 

}

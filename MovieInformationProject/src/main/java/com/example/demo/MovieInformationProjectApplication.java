package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.bean.Movie;
import com.example.persistence.MovieDao;

@SpringBootApplication(scanBasePackages = "com.example")
@EntityScan(basePackages = "com.example.bean")
@EnableJpaRepositories(basePackages = "com.example.persistence")
public class MovieInformationProjectApplication {
    
	/*
	 * @Autowired private MovieDao movieDao;
	 */
	
	public static void main(String[] args)  {
		SpringApplication.run(MovieInformationProjectApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * 
	 * movieDao.save(new Movie("101","ABCDE")); movieDao.save(new
	 * Movie("102","PQRST")); movieDao.save(new Movie("103","XYZW"));
	 * movieDao.save(new Movie("104","QWERTY")); movieDao.save(new
	 * Movie("105","ASDF"));
	 * 
	 * }
	 */

}

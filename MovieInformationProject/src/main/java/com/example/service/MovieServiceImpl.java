package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Movie;
import com.example.persistence.MovieDao;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao movieDao;
	
	@Override
	public Movie searchById(String id) {
		
		Optional<Movie> opMovie=movieDao.findById(id);
		Movie movie=null;
		if(opMovie.isPresent())
			movie=opMovie.get();
		return movie;
		
	}

}

package com.example.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Movie;
import com.example.service.MovieService;

@RestController
public class MovieResource {

	@Autowired
	private MovieService movieService;
	
	@GetMapping(path="/movies/{id}",produces="application/json")
	public Movie getMovieById(@PathVariable("id") String id)
	{
		return movieService.searchById(id);
	}
	
}

package com.example.service;

import com.example.bean.RatingList;

public interface RatingService {

	RatingList getRatingByUserId(String userId);
	
}

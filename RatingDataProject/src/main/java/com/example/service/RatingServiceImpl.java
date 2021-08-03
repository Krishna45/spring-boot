package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.RatingList;
import com.example.persistence.RatingDao;


@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingDao ratingDao;
	
	@Override
	public RatingList getRatingByUserId(String userId) {
		
		return new RatingList(ratingDao.findAllByUserId(userId));
		
	}

}

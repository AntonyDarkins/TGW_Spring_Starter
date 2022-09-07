package com.tgw.movieapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tgw.movieapi.persistance.repo.MovieRepo;

@Service
public class MovieService {
	
	//Repo
	@Autowired
	private MovieRepo repo;
	
//	@Autowired
	public MovieService(MovieRepo repo) {
		this.repo = repo;
	}

}

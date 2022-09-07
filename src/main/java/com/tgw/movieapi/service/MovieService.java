package com.tgw.movieapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tgw.movieapi.persistance.model.Movie;
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
	
	public Movie create(Movie movie) {
		return this.repo.saveAndFlush(movie);
	} 
	
	//CRUD -- Create One and Create Many, Read, Update and my Delete.

}

package com.tgw.movieapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tgw.movieapi.persistance.model.Movie;
import com.tgw.movieapi.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	//Ill save this for later.
	//This is the class in which we are dealing with client facing side
	
	//It takes in a body of information -- XML,YAML, JSON.
	//It will delegate the body of information to the service classes and then once done return a HTTP Status
	
	@Autowired
	private MovieService service;
	
	public MovieController(MovieService service) {
		this.service = service;
	}
	
	//@RequestBody -- Take in an incoming body of info 
	//@PathVariable -- /{id} this will infer the url param as a variable.
	
	//Create - Post
	//Put -- 
	
	@PostMapping("/create")
	public ResponseEntity<Movie> create(@RequestBody Movie movie) {
		return new ResponseEntity<Movie>(this.service.create(movie), HttpStatus.ACCEPTED);
	}

}

package com.tgw.movieapi.service;

import java.util.Optional;

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
	
	public Movie readyById(Integer id) {
		return this.repo.findById(id).orElse(null);
	}
	
	public Movie update(Movie updatedMovie, Integer id) {
		
		Optional<Movie> moviePresent = this.repo.findById(id);
		
		if (moviePresent.isPresent() && moviePresent.get().getId() == updatedMovie.getId()) {
			Movie oldMovie = moviePresent.get();
			oldMovie.setTitle(updatedMovie.getTitle());
			oldMovie.setRating(updatedMovie.getRating());
			oldMovie.setReleaseDate(updatedMovie.getReleaseDate());
			this.repo.saveAndFlush(oldMovie);
			return oldMovie;		
		}
		return null;
	}
	
	public Boolean delete(Integer id) {
		Optional<Movie> moviePresent = this.repo.findById(id);
		
		if (moviePresent.isPresent()) {
			this.repo.deleteById(id);
			return true;
		}
		
		return false;
	}
	
 
}

package com.tgw.movieapi.persistance.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.tgw.movieapi.persistance.model.Movie;

public interface MovieRepo extends JpaRepository<Movie, Integer>{

}

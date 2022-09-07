package com.tgw.movieapi.persistance.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tgw.movieapi.persistance.model.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {

}

package com.tgw.movieapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MovieApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieApiApplication.class, args);
	}
	
	// Spring framework itself is an inversion of control container
	
	// Sring Framework is split into about 20+ projects:
	
	// Spring Data -- Access data in a consistent manner
	// Spring Boot -- Rapid Creation of low config projects create an api and not ghave to worry about the heavyu lifting
	// Spring Security 
	// Spring Cloud 
	
	// Bean --> 
	// A method that becomes managed by Spring 
	
	@Bean
	public void helloWorld() {
		System.out.println("helloWorld"); 
	}
	

}

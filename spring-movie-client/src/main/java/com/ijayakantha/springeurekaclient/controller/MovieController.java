package com.ijayakantha.springeurekaclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ijayakantha.springeurekaclient.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	MovieService movieService;
	
	@GetMapping("/movies")
	public ResponseEntity<List<String>> getMovies(){
		List<String> movieList=movieService.getMovies();
		
		return new ResponseEntity<List<String>>(movieList,HttpStatus.OK);
	}
}

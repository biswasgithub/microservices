package com.ijayakantha.springeurekaclient.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MovieService {

	public List<String> getMovies() {
		List<String> movieList=new ArrayList<>();
		movieList.add("ThreeIdiots");
		movieList.add("Raaz");
		movieList.add("Lagan");
		
		return movieList;
	}
}

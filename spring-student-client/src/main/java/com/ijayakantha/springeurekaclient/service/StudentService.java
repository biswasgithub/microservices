package com.ijayakantha.springeurekaclient.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class StudentService {

	@Autowired
	BookFeignService bookFeignService;
	
	@Autowired
	MovieFeignService movieFeignService;
	
	@HystrixCommand(fallbackMethod = "bookFallback")
	public List<String> getBooks(){
		
		List<String> booklist=bookFeignService.getBooks();
		
		return booklist;
	}
	
	
	public List<String> bookFallback(){
		
		List<String> booklist=new ArrayList<>();
		booklist.add("There is a problem: No books");
		return booklist;
	}
	
	@HystrixCommand(fallbackMethod = "movieFallback")
	public List<String> getMovies(){
		
		List<String> movieklist=movieFeignService.getMovies().getBody();
		
		return movieklist;
	}
	
	
	public List<String> movieFallback(){
		
		List<String> movielist=new ArrayList<>();
		movielist.add("There is a problem: No movies");
		return movielist;
	}
	
}

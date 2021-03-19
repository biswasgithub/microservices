package com.ijayakantha.springeurekaclient.dto;

import java.util.List;

public class Students {

	private String name;
	
	List<String> bookList;
	
	List<String> movieList;
	
	public Students(String name, List<String> bookList) {
		super();
		this.name = name;
		this.bookList = bookList;
	}

	public Students(String name, List<String> bookList, List<String> movieList) {
		super();
		this.name = name;
		this.bookList = bookList;
		this.movieList = movieList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getBookList() {
		return bookList;
	}

	public void setBookList(List<String> bookList) {
		this.bookList = bookList;
	}

	public List<String> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<String> movieList) {
		this.movieList = movieList;
	}
}

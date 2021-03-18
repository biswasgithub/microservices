package com.ijayakantha.springeurekaclient.dto;

import java.util.List;

public class Students {

	private String name;
	
	List<String> bookList;

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
	
	
	
}

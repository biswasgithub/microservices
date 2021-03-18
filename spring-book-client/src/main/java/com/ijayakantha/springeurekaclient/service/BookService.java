package com.ijayakantha.springeurekaclient.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	public List<String> getBooks(){
		List<String> bookList=new ArrayList<String>();
		
		bookList.add("Math");
		bookList.add("Phy");
		bookList.add("Chem");
		bookList.add("Bio");
		
		return bookList;
	}

}

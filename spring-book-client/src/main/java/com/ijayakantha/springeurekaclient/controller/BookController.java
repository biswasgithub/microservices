package com.ijayakantha.springeurekaclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ijayakantha.springeurekaclient.service.BookService;

@RestController
@RequestMapping("v1/book")
public class BookController {
	
	@Autowired
	
	BookService bookService;
	
	@GetMapping("/books")
	public List<String> getBooks(){
		List<String> bookList=bookService.getBooks();
		return bookList;
		
	}

}

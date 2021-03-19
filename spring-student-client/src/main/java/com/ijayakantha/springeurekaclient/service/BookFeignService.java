package com.ijayakantha.springeurekaclient.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="book-client")
@RequestMapping("v1/book")
public interface BookFeignService {

	@GetMapping("/books")
	public List<String> getBooks();
}


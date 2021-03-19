package com.ijayakantha.springeurekaclient.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="movie-client")
public interface MovieFeignService {

	@GetMapping("/movies")
	public ResponseEntity<List<String>> getMovies();
}

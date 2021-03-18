package com.ijayakantha.springeurekaclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ijayakantha.springeurekaclient.dto.Students;
import com.ijayakantha.springeurekaclient.service.StudentFeignService;

@RestController
@RequestMapping("v1/student")
public class StudentController {

	@Autowired
	StudentFeignService studentFeignService;
	
	@GetMapping("/students")
	public ResponseEntity<Students> getStudents(){
		
		List<String> bookList=studentFeignService.getBooks();
		
		System.out.println("***************** :  "+bookList.size());
		
		Students student=new Students();
		student.setName("Rahul");
		student.setBookList(bookList);
		
		return new ResponseEntity<Students>(student,HttpStatus.OK);
	}
	
}

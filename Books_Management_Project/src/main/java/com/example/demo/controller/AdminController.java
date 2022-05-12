package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BookDetails;
import com.example.demo.model.Student;
import com.example.demo.service.BookService;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	StudentService obj;
	@Autowired
	BookService service;
	@GetMapping("/fetchstu")
	public List<Student> fetchstu(){
		List<Student> list=obj.fetchall();
		return list;
	}
@PostMapping("/addbook")
public void addbook(@RequestBody BookDetails bo) {
	service.addbook(bo);
	System.out.println("Book added sucessfully");
}
@PutMapping("/updatebook/{id}")
public ResponseEntity<BookDetails> updatebook(@PathVariable(value="id")Integer id,@RequestBody BookDetails det){
	BookDetails boo=service.updatebook(det, id);
	return new ResponseEntity<BookDetails>(boo,HttpStatus.OK);
}
@DeleteMapping("/deletebook/{id}")
public  ResponseEntity<BookDetails> deletebook(@PathVariable(value="id")Integer id){
	BookDetails book=service.deleteBook(id);
	return new  ResponseEntity<BookDetails>(book,HttpStatus.OK);
}
}

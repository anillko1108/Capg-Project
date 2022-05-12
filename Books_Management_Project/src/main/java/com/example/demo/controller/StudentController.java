package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BookDetails;
import com.example.demo.service.BookService;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
@Autowired
BookService service;
@Autowired
StudentService obj;
@GetMapping("/allbooks")
public List<BookDetails> fetch(){
	List<BookDetails> list=service.getAllBooks();
	return list;
}
@GetMapping("/bookbyid/{id}")
public ResponseEntity<BookDetails> findbyid(@PathVariable(value="id")Integer id){
	BookDetails book=service.getBookByCode(id);
	return new ResponseEntity<BookDetails>(book,HttpStatus.OK);
}
}

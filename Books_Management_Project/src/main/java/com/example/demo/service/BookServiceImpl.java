package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BookDetails;
import com.example.demo.repository.UserRepository;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	UserRepository userRepo;

	@Override
	public List<BookDetails> getAllBooks() {
		List<BookDetails> books = new ArrayList<>();  
		userRepo.findAll().forEach(books1 -> books.add(books1));  
		return books; 

	}

	@Override
	public BookDetails getBookByCode(Integer Bcode) {
		return userRepo.findById(Bcode).get();  
	}

	@Override
	public void addbook(BookDetails b) {
		userRepo.save(b);
		
	}

	@Override
	public BookDetails deleteBook(int bid) {
		BookDetails bo=userRepo.getById(bid);
		userRepo.deleteById(bid);
		return bo;
	}
	@Override
	public BookDetails updatebook(BookDetails bo,int bid) {
		BookDetails de=userRepo.getById(bid);
		de.setBookName(bo.getBookName());
		de.setBookType(bo.getBookType());
		de.setPrice(bo.getPrice());
		de.setQuantity(bo.getQuantity());
		userRepo.save(de);
		return de;
		
		
	}

	

}

package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.BookDetails;

@Service
public interface BookService {
	List<BookDetails> getAllBooks();
	BookDetails getBookByCode(Integer Bcode);
	void addbook(BookDetails b);
	BookDetails deleteBook(int bid);
	BookDetails updatebook(BookDetails bo, int bid);

}

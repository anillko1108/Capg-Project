package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.model.Librarian;

@Service
public interface LibrarianService {
	
	List<Librarian> getAllLibrarian();

	Librarian getLibrarianById(int librarianId);

	Librarian updateLibrarianById(int librarianId, Librarian newLibrarian);

	void deleteLibrarianById(int librarianId);

	Librarian addLibrarian(Librarian newLibrarian);

	Librarian getLibrarianByAccountNumber(String accountNumber);
	
	
}

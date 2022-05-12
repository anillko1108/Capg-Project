package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.model.Librarian;


public class LibrarianServiceImpl implements LibrarianService {
	
	private List<Librarian> librarians;
	
	
	public LibrarianServiceImpl() {
		this.librarians = new ArrayList<Librarian>();
	}
	
	public Librarian addLibrarian(Librarian newLibrarian) {
		
		for(Librarian librarian : librarians) {
			if(librarian.getLibrarianId() == newLibrarian.getLibrarianId() || librarian.getAccountNumber().equals(newLibrarian.getAccountNumber())) {
				return null;
			}
		}
		librarians.add(newLibrarian);
		return newLibrarian;
	}
	
	public List<Librarian> getAllLibrarian() {
		return librarians;
	}

	public Librarian getLibrarianById(int librarianId) {
		
		for(Librarian librarian : librarians) {
			if(librarian.getLibrarianId() == librarianId) {
				return librarian;
			}
		}
		
		return null;
	}
	
	public Librarian getLibrarianByAccountNumber(String accountNumber) {
		
		for(Librarian librarian : librarians) {
			if(librarian.getAccountNumber().equals(accountNumber)) {
				return librarian;
			}
		}
		return null;
	}

	public Librarian updateLibrarianById(int librarianId, Librarian newLibrarian) {
		
		for(Librarian librarian: librarians) {
			if(librarian.getLibrarianId() == librarianId) {
				librarian.setLibrarianName(newLibrarian.getLibrarianName());
				return librarian;
			}
		}
		
		return null;
	}


	public void deleteLibrarianById(int librarianId) {
		librarians = librarians.stream().filter(librarian -> librarian.getLibrarianId() != librarianId).collect(Collectors.toList());
	}

	

	

}

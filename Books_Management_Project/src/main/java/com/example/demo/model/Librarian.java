package com.example.demo.model;


public class Librarian {
	
	private int librarianId;
	private String accountNumber;
	private String librarianName;

	
	public Librarian() {
		super();
	}
	
	public Librarian(int librarianId, String accountNumber, String librarianName) {
		super();
		this.librarianId = librarianId;
		this.accountNumber = accountNumber;
		this.librarianName = librarianName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getLibrarianId() {
		return librarianId;
	}
	public void setLibrarianId(int librarianId) {
		this.librarianId = librarianId;
	}
	
	public String getLibrarianName() {
		return librarianName;
	}
	public void setLibrarianName(String librarianName) {
		this.librarianName = librarianName;
	}
	
}

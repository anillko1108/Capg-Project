package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyIntitializer","handler"})
@Entity
public class BookDetails implements Serializable {
	@Id
	int bookCode;
	String bookType;
	String bookName;
	int quantity;
	int edition;
	public BookDetails() {
		super();
	}
	public BookDetails(int bookCode, String bookType, String bookName, int quantity, int price) {
		super();
		this.bookCode = bookCode;
		this.bookType = bookType;
		this.bookName = bookName;
		this.quantity = quantity;
		this.edition = price;
	}
	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return edition;
	}
	public void setPrice(int price) {
		this.edition = price;
	}
	@Override
	public String toString() {
		return "BookDetails [bookCode=" + bookCode + ", bookType=" + bookType + ", bookName=" + bookName + ", quantity="
				+ quantity + ", price=" + edition + "]";
	}
	
}

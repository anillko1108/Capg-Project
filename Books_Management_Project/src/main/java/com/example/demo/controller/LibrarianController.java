package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.example.demo.model.Librarian;
import com.example.demo.service.LibrarianService;
import com.example.demo.service.LibrarianServiceImpl;


@RestController
@RequestMapping("/librarian")
public class LibrarianManagementController {
	
	@Autowired
	private RestTemplate restTemplate;
	private LibrarianService librarianService;
	
	public LibrarianManagementController() {
		librarianService = new librarianSericeImpl(); 
	}
	
	@PostMapping("/add-librarian")
	public Librarian addLibrarian(@RequestBody Librarian newLibrarian){
		
		Librarian librarian = librarianervice.addLibrarian(newLibrarian);
		if(librarian != null) {
			Account newAccount = new Account(newLibrarian.getAccountNumber());
			restTemplate.postForObject(Constants.ACCOUNT_MANAGEMENT_SERVICE_URL + "add-account", newAccount, Account.class);
		}
		return librarian;
	}

	@RequestMapping("/get-all-librarian")
	public List<Librarian> getAllLibrarian(){
		
		return librarianService.getAllLibrarian();
		
	}
	
	@RequestMapping("/get-librarian-by-librarian-id/{librarianId}")
	public Librarian getLibrarian(@PathVariable("librarianId") int librarianId){
		
		return librarianService.getLibrarianById(librarianId);
		
	}
	
	@RequestMapping("/get-librarian-by-account-number/{accountNumber}")
	public Librarian getLibrarianByAccountNumber(@PathVariable("accountNumber") String accountNumber){
		
		return librarianService.getLibrarianByAccountNumber(accountNumber);
		
	}
	
	@PutMapping("/update-librarian/{librarianId}")
	public Librarian updateLibrarian(@RequestBody Librarian newlibrarian, @PathVariable("librarianId") int librarianId){
		
		return librarianService.updateLibrarianById(librarianId, newLibrarian);
		
	}
	
	@DeleteMapping("/delete-librarian/{librarianId}")
	public void deleteLibrarian(@PathVariable("librarianId") int librarianId){
		Librarianlibrarian = librarianService.getLibrarianById(librarianId);
		if(librarian != null) {
			restTemplate.delete(Constants.ACCOUNT_MANAGEMENT_SERVICE_URL + "delete-account/" + librarian.getAccountNumber());
		}		
	}
	
	@DeleteMapping("/remove-librarian/{librarianId}")
	public void removeLibrarian(@PathVariable("librarianId") int librarianId){
		librarianService.deleteLibrarianById(librarianId);
	}
	
}

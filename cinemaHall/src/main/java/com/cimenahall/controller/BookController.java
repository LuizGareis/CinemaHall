package com.cimenahall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cimenahall.models.Book;
import com.cimenahall.services.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<Book> getBook(@PathVariable("id") Long id){
		return ResponseEntity.ok(service.findById(id)); 
	}
	
	@PutMapping
	public ResponseEntity<Book> putBook(@RequestBody Book book){
		return ResponseEntity.ok(service.update(book));
	}
	
	@PostMapping
	public ResponseEntity<Book> postBook(@RequestBody Book book){
		return ResponseEntity.ok(service.save(book));
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Book> deleteBook(@PathVariable("id") Long id){
		service.delete(id);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping
	public ResponseEntity<List<Book>> getAllBooks(){
		return ResponseEntity.ok(service.findAll());
	}
}

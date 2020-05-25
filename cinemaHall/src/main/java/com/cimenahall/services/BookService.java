package com.cimenahall.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cimenahall.models.Book;
import com.cimenahall.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	public BookRepository rep;
	
	
	public Book save(Book book) {
		return rep.save(book);
	}
	
	public Book update(Book book) {
		Book bookOld = findById(book.getId());
		bookOld.setDate(book.getDate());
		bookOld.setSeatNumber(book.getSeatNumber());
		
		return save(bookOld);
	}
	
	public void delete(Long id) {
		Book book = findById(id);
		rep.delete(book);
	}
	
	public Book findById(Long id) {
		return rep.findById(id).orElse(null);
	}
	
	public List<Book> findAll(){
		return rep.findAll();
	}
}

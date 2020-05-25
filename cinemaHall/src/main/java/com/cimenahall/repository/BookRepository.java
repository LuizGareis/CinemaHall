package com.cimenahall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cimenahall.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
	
	

}

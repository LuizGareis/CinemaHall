package com.cimenahall.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Payment implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 742097491487106799L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany
	private List<Book> bookList;
	
	@Column
	private Date date;
	
	@Column
	private String transactionNumber;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
}

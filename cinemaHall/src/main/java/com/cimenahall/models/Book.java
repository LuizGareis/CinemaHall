package com.cimenahall.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Book implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2003286741072749572L;
	
	private Long id;
	
	private Integer seatNumber;
	
	private Date date;
	
	
}

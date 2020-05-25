package com.cimenahall.models;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Movie implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5849606613349417939L;
	
	private Long id;
	private String name;
	private Integer seat;
	private String language;
	
	
}

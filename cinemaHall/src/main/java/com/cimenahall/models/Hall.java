package com.cimenahall.models;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Hall implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -957964909217993854L;

	private Long id;
	
	private String name;
	
	private Integer seatNumber;
	
	private String address;
}

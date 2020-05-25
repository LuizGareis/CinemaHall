package com.cimenahall.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Hall implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -957964909217993854L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private Integer seatNumber;
	
	@Column
	private String address;
}

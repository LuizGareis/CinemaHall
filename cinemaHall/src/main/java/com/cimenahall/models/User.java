package com.cimenahall.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "users")
@Data
public abstract class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5201029483577222995L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String userName;
	
	@Column
	private String password;
	
	@Column
	private String email;
	
	@Column
	private String address;
	
	@Column
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Role role;
}

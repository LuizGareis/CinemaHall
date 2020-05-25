package com.cimenahall.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Status {
	
	PENDING(1, "Pending"),
	CONFIRMED(2, "Confirmed");
	
	private Integer cod;
	private String desc;
	
}

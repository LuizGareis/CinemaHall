package com.cimenahall.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Role {

	ADMIN(1, "Admin"),
	MANAGER(2, "Manager"),
	VIEWER(3, "Viewer"),
	TICKET_SELLER(4, "Ticket Seller");
	
	private Integer cod;
	private String desc;
	
}

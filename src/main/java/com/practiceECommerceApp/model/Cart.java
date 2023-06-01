package com.practiceECommerceApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Cart {
	
	@Id
	@GeneratedValue
	private Long cartId;
	private Long customerId; 
}

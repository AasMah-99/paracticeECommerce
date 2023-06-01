package com.practiceECommerceApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CustomerDetails {
	
	@Id
	@GeneratedValue
	private Long customerId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String phoneNo;
	
	private Address address;
	

}

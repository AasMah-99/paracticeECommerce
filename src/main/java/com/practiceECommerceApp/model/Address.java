package com.practiceECommerceApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Address {
	@Id
	@GeneratedValue
	private String addressId;
	private String addressLine;
	private String landMark;
	private String city;
	private String state;
	private String postalCode;
	
}

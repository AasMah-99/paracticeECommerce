package com.practiceECommerceApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Category {
	@Id
	@GeneratedValue
	private Long categoryId;
	private String categoryTitle;
	
}

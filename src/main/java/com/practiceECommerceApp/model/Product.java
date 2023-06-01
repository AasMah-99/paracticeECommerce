package com.practiceECommerceApp.model;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {
	
	@Id
	@GeneratedValue
	private Long productId;
	private String productName;
	private MultipartFile image;
	private String productDescription;
	private String price;
	private String brand;
	private String rating;
	
	private Long categoryId;
	
}

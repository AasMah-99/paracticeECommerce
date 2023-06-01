package com.practiceECommerceApp.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Order {
	
	@Id
	@GeneratedValue
	private Long orderId;
	private Date orderDate;
	
	private Long customerId;;
	private Long productId;
	private Long cartId;
	
}

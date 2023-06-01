package com.practiceECommerceApp.service;

import com.practiceECommerceApp.exception.CustomerNotAddedException;
import com.practiceECommerceApp.exception.CustomerNotDeletedException;
import com.practiceECommerceApp.exception.CustomerNotFoundException;
import com.practiceECommerceApp.exception.CustomerNotUpdatedException;
import com.practiceECommerceApp.model.CustomerDetails;

public interface CustomerService {
	
	public CustomerDetails getCustomerById(Long customerId) throws CustomerNotFoundException ;
	
	public CustomerDetails addCustomer(CustomerDetails customerDetails) throws CustomerNotAddedException;
	
	public Boolean updateCustomer(CustomerDetails customerDetails) throws CustomerNotUpdatedException;
	
	public Boolean deleteCustomer(CustomerDetails customerDetails) throws CustomerNotDeletedException;
	
}

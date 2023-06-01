package com.practiceECommerceApp.service;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practiceECommerceApp.exception.CustomerNotAddedException;
import com.practiceECommerceApp.exception.CustomerNotDeletedException;
import com.practiceECommerceApp.exception.CustomerNotFoundException;
import com.practiceECommerceApp.exception.CustomerNotUpdatedException;
import com.practiceECommerceApp.model.CustomerDetails;
import com.practiceECommerceApp.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public CustomerDetails getCustomerById(Long customerId) throws CustomerNotFoundException {
		Optional<CustomerDetails> customerDetails = customerRepository.findById(customerId);
		if(customerDetails.isPresent())
			return customerDetails.get();
		throw new CustomerNotFoundException("Customer Not Found...");
	}

	@Override
	public CustomerDetails addCustomer(CustomerDetails customerDetails) throws CustomerNotAddedException {
		if(Objects.isNull(customerDetails))
			throw new CustomerNotAddedException("Customer Not Added...");
		return customerRepository.save(customerDetails);
	}

	@Override
	public Boolean updateCustomer(CustomerDetails customerDetails) throws CustomerNotUpdatedException {
		if(customerRepository.existsById(customerDetails.getCustomerId())) {
			CustomerDetails customer = customerRepository.save(customerDetails);
			if(customer!=null)
				return true;
		}
		throw new CustomerNotUpdatedException("Customer Details Not Updated...");
	}

	@Override
	public Boolean deleteCustomer(CustomerDetails customerDetails) throws CustomerNotDeletedException {
		customerRepository.delete(customerDetails);
		if(customerRepository.existsById(customerDetails.getCustomerId()))
			throw new CustomerNotDeletedException("Customer details Was Not Deleted...");
		return true;
	}

}

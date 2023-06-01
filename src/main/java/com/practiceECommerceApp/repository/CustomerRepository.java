package com.practiceECommerceApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practiceECommerceApp.model.CustomerDetails;

public interface CustomerRepository extends JpaRepository<CustomerDetails, Long> {

}

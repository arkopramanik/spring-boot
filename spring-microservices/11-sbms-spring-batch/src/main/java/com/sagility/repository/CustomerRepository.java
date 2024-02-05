package com.sagility.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagility.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String>{

}

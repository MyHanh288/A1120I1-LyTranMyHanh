package com.example.demo.model.repository;

import com.example.demo.model.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    Page<Customer> findAllByCustomerNameContaining(String customerName, Pageable pageable);
}

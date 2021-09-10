package com.example.demo.model.service;

import com.example.demo.model.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    void save(Customer customer);
    void remove(String customerId);
    Customer findById(String customerId);
    Page<Customer> findAllByCustomerNameContaining(String customerName, Pageable pageable);
}

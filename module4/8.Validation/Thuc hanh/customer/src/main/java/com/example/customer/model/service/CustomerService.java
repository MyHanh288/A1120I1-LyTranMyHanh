package com.example.customer.model.service;

import com.example.customer.model.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    void save(Customer customer);
    void delete(Customer customer);
    Customer findById (Integer id);
    Page<Customer> findAllByName (String name, Pageable pageable);
}

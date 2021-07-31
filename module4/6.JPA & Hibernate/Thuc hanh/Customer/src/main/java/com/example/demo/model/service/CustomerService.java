package com.example.demo.model.service;

import com.example.demo.model.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


//chị phải  @Servier để nó biết là servier á
@Service
public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    void  save(Customer customer);
    void remove(Customer customer);
    Customer update(Integer id, Customer customer);
    Customer findById(Integer id);
    Page<Customer> findByNameContaining(String name, Pageable pageable);
}

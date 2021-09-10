package com.example.demo.model.service;

import com.example.demo.model.entity.customer.CustomerType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerTypeService {
    List<CustomerType> findAll();
    void save(CustomerType customerType);
    void remove(String customerTypeId);
    CustomerType findById(String customerTypeId);
}

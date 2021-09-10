package com.example.demo.model.service;

import com.example.demo.model.entity.customer.CustomerType;
import com.example.demo.model.repository.CustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {
    @Autowired
    private CustomerTypeRepository customerTypeRepository;

    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }

    @Override
    public void save(CustomerType customerType) {
        customerTypeRepository.save(customerType);
    }

    @Override
    public void remove(String customerTypeId) {
        customerTypeRepository.deleteById(customerTypeId);
    }

    @Override
    public CustomerType findById(String customerTypeId) {
        return customerTypeRepository.findById(customerTypeId).orElse(null);
    }
}

package com.example.demo.model.service;

import com.example.demo.model.entity.Phone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface PhoneService {
    Page<Phone> findAll(Pageable pageable);
    void save(Phone phone);
    void delete(Phone phone);
    Phone findById (Integer id);
    Page<Phone> findAllByName (String name, Pageable pageable);
}

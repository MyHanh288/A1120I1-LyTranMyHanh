package com.example.demo.model.repository;

import com.example.demo.model.entity.Phone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Integer> {
    Page<Phone> findAllByNameContaining(String name, Pageable pageable);
}

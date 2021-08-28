package com.example.demo.model.service;

import com.example.demo.model.entity.Phone;
import com.example.demo.model.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PhoneServiceImpl implements PhoneService{
    @Autowired
    private PhoneRepository phoneRepository;

    @Override
    public Page<Phone> findAll(Pageable pageable) {
        return phoneRepository.findAll(pageable);
    }

    @Override
    public void save(Phone phone) {
        phoneRepository.save(phone);
    }

    @Override
    public void delete(Phone phone) {
        phoneRepository.delete(phone);
    }

    @Override
    public Phone findById(Integer id) {
        return phoneRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Phone> findAllByName(String name, Pageable pageable) {
        return phoneRepository.findAllByNameContaining(name, pageable);
    }
}

package com.example.demo.model.service;

import com.example.demo.model.entity.KhuyenMai;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface KhuyenMaiService {
    Page<KhuyenMai> findAll(Pageable pageable);
    void save(KhuyenMai khuyenMai);
    void remove(Integer khuyenMaiId);
    KhuyenMai findById(Integer khuyenMaiId);
    Page<KhuyenMai> findAllByTieuDeContaining(String tieuDe, Pageable pageable);
//    Page<Customer> findAll(Pageable pageable);
//    void save(Customer customer);
//    void remove(String customerId);
//    Customer findById(String customerId);
//    Page<Customer> findAllByCustomerNameContaining(String customerName, Pageable pageable);
}

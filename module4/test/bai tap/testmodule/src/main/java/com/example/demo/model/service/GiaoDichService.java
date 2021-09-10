package com.example.demo.model.service;

import com.example.demo.model.entity.GiaoDich;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface GiaoDichService {
    Page<GiaoDich> findAll(Pageable pageable);
    void save(GiaoDich giaoDich);
    void remove(String maGiaoDich);
    GiaoDich findById(String maGiaoDich);
    Page<GiaoDich> findAllByKhachHangContaining(String tenKhachHang, Pageable pageable);

}

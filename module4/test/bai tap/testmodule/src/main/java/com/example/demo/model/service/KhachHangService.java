package com.example.demo.model.service;

import com.example.demo.model.entity.KhachHang;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KhachHangService {
    List<KhachHang> findAll();
    void save(KhachHang khachHang);
    void remove(String maKhachHang);
    KhachHang findById(String maKhachHang);
}

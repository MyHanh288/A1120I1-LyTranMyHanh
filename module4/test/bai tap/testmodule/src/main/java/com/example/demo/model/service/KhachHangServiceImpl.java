package com.example.demo.model.service;

import com.example.demo.model.entity.KhachHang;
import com.example.demo.model.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangServiceImpl implements KhachHangService{
    @Autowired
    private KhachHangRepository khachHangRepository;

    @Override
    public List<KhachHang> findAll() {
        return khachHangRepository.findAll();
    }

    @Override
    public void save(KhachHang khachHang) {
        khachHangRepository.save(khachHang);
    }

    @Override
    public void remove(String maKhachHang) {
        khachHangRepository.deleteById(maKhachHang);
    }

    @Override
    public KhachHang findById(String maKhachHang) {
        return khachHangRepository.findById(maKhachHang).orElse(null);
    }
}

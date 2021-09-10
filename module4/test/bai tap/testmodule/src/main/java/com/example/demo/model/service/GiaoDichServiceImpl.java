package com.example.demo.model.service;

import com.example.demo.model.entity.GiaoDich;
import com.example.demo.model.repository.GiaoDichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class GiaoDichServiceImpl implements GiaoDichService{
    @Autowired
    private GiaoDichRepository giaoDichRepository;

    @Override
    public Page<GiaoDich> findAll(Pageable pageable) {
        return giaoDichRepository.findAll(pageable);
    }

    @Override
    public void save(GiaoDich giaoDich) {
        giaoDichRepository.save(giaoDich);
    }

    @Override
    public void remove(String maGiaoDich) {
        giaoDichRepository.deleteById(maGiaoDich);
    }

    @Override
    public GiaoDich findById(String maGiaoDich) {
        return giaoDichRepository.findById(maGiaoDich).orElse(null);
    }

    @Override
    public Page<GiaoDich> findAllByKhachHangContaining(String tenKhachHang, Pageable pageable) {
        return giaoDichRepository.findAllByKhachHangContaining(tenKhachHang,pageable);
    }
}

package com.example.demo.model.repository;

import com.example.demo.model.entity.GiaoDich;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GiaoDichRepository extends JpaRepository<GiaoDich, String> {
    Page<GiaoDich> findAllByKhachHangContaining(String tenKhachHang, Pageable pageable);
}

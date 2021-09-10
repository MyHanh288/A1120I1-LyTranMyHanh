package com.example.demo.model.repository;

import com.example.demo.model.entity.KhuyenMai;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KhuyenMaiRepository extends JpaRepository<KhuyenMai, Integer> {
      Page<KhuyenMai> findAllByTieuDeContaining(String tieuDe, Pageable pageable);
}

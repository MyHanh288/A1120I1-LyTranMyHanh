package com.example.demo.model.service;

import com.example.demo.model.entity.KhuyenMai;
import com.example.demo.model.repository.KhuyenMaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;

@Service
public class KhuyenMaiServiceImpl implements KhuyenMaiService{
    @Autowired
    private KhuyenMaiRepository khuyenMaiRepository;

    @Override
    public Page<KhuyenMai> findAll(Pageable pageable) {
        return khuyenMaiRepository.findAll(pageable);
    }

    @Override
    public void save(KhuyenMai khuyenMai) {
        khuyenMaiRepository.save(khuyenMai);
    }

    @Override
    public KhuyenMai findById(Integer khuyenMaiId) {
        return khuyenMaiRepository.findById(khuyenMaiId).orElse(null);
    }

    @Override
    public void remove(Integer khuyenMaiId) {
        khuyenMaiRepository.deleteById(khuyenMaiId);
    }

    @Override
    public Page<KhuyenMai> findAllByTieuDeContaining(String tieuDe, Pageable pageable) {
        return khuyenMaiRepository.findAllByTieuDeContaining(tieuDe, pageable);
    }
}

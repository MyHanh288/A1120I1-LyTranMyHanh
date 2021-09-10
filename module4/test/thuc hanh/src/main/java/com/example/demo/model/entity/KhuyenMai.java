package com.example.demo.model.entity;

import javax.persistence.*;

@Entity
public class KhuyenMai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer khuyenMaiId;
    @Column
    private String tieuDe;
    @Column
    private String thoiGianBatDau;
    @Column
    private String thoiGianKetThuc;
    @Column
    private String mucGiamGia;
    @Column
    private String chiTiet;


    public KhuyenMai() {
    }

    public KhuyenMai(Integer khuyenMaiId, String tieuDe, String thoiGianBatDau, String thoiGianKetThuc, String mucGiamGia, String chiTiet) {
        this.khuyenMaiId = khuyenMaiId;
        this.tieuDe = tieuDe;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.mucGiamGia = mucGiamGia;
        this.chiTiet = chiTiet;
    }

    public Integer getKhuyenMaiId() {
        return khuyenMaiId;
    }

    public void setKhuyenMaiId(Integer khuyenMaiId) {
        this.khuyenMaiId = khuyenMaiId;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(String thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public String getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(String thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public String getMucGiamGia() {
        return mucGiamGia;
    }

    public void setMucGiamGia(String mucGiamGia) {
        this.mucGiamGia = mucGiamGia;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }
}

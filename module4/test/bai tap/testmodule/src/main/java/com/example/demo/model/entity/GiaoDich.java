package com.example.demo.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class GiaoDich {
    @Id
    private String maGiaoDich;
    private String ngayGiaoDich;
    private String loaiDichVu;
    private Integer donGia;
    private Integer dienTich;
    @ManyToOne
    @JoinColumn(name ="maKhachHang",referencedColumnName = "maKhachHang")
    private KhachHang khachHang;

    public GiaoDich() {
    }

    public GiaoDich(String maGiaoDich, String ngayGiaoDich, String loaiDichVu, Integer donGia, Integer dienTich, KhachHang khachHang) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.loaiDichVu = loaiDichVu;
        this.donGia = donGia;
        this.dienTich = dienTich;
        this.khachHang = khachHang;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    public Integer getDonGia() {
        return donGia;
    }

    public void setDonGia(Integer donGia) {
        this.donGia = donGia;
    }

    public Integer getDienTich() {
        return dienTich;
    }

    public void setDienTich(Integer dienTich) {
        this.dienTich = dienTich;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }
}

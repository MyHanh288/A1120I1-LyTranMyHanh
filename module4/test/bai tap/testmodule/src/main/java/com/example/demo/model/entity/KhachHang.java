package com.example.demo.model.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class KhachHang {
    @Id
    private String maKhachHang;
    private String tenKhachHang;
    private String soDienThoai;
    private String email;
    @OneToMany(mappedBy = "khachHang", cascade = CascadeType.ALL)
    private List<GiaoDich> giaoDichs;

    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String tenKhachHang, String soDienThoai, String email, List<GiaoDich> giaoDichs) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.giaoDichs = giaoDichs;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<GiaoDich> getGiaoDichs() {
        return giaoDichs;
    }

    public void setGiaoDichs(List<GiaoDich> giaoDichs) {
        this.giaoDichs = giaoDichs;
    }
}

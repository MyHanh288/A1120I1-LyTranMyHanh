package _exercise.employed;

import java.util.Scanner;

public class Employed {
    private String hoTen, gioiTinh, diaChi;
    private int namSinh;

    Scanner scanner = new Scanner(System.in);

    public Employed() {
    }

    public Employed(String hoTen, String gioiTinh, String diaChi, int namSinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void nhap(){
        System.out.println("Nhap ho ten : ");
        hoTen = scanner.nextLine();
        System.out.println("Nhap gioi tinh : ");
        gioiTinh = scanner.nextLine();
        System.out.println("Nhap nam sinh : ");
        namSinh = scanner.nextInt();
        System.out.println("Nhap dia chi : ");
        diaChi = scanner.nextLine();
    }

    public void xuat(){
        System.out.println("Ho ten : " + hoTen + ", Gioi tinh : " + gioiTinh + ", Nam sinh : " + namSinh + ", Dia chi : " + diaChi);
    }
}

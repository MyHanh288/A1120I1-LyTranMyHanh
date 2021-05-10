package _example.services;

import _example.commons.Regex;
import _example.model.SPNhapKhau;
import _example.model.SPXuatKhau;
import _example.model.Sanpham;

import java.util.Scanner;

public class CommonService {
    private static Regex regex;
    static{
        regex = new Regex();
    }
    public Sanpham inputSanPham(int typeSanPham){
        String id;
        String masp;
        String ten;
        String giaban;
        String soluong;
        String nhasanxuat;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id san pham");
        id = sc.nextLine();
        System.out.println("Nhap masp");
        masp = sc.nextLine();
        System.out.println("Nhap ten");
        ten = sc.nextLine();

        System.out.println("Nhap gia ban");
        giaban = sc.nextLine();
        while(!regex.validateNumber(giaban)){
            System.out.println("Please, Try again!");
            giaban =  (sc.nextLine());
        };
        System.out.println("nhap soluong");
        soluong = sc.nextLine();

        while(!regex.validateNumber(soluong)){
            System.out.println("Please, Try again!");
            soluong =  (sc.nextLine());
        };
        System.out.println("Nhap nha san xuat");
        nhasanxuat = sc.nextLine();
        switch (typeSanPham){
            case 1:
                return new SPNhapKhau(id,masp,ten,giaban,soluong,nhasanxuat);
            case 2:
                return new SPXuatKhau(id,masp,ten,giaban,soluong,nhasanxuat);
        }
        return null;
    };



}

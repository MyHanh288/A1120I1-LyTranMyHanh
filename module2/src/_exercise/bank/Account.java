package _exercise.bank;

import java.util.Scanner;

public class Account {
    private long soTK;
    private String tenTK;
    private double soTienTrongTK;

    Scanner scanner = new Scanner(System.in);

    public Account() {
    }

    public Account(long soTK, String tenTK, double soTienTrongTK) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTienTrongTK = soTienTrongTK;
    }

    public long getSoTK() {
        return soTK;
    }

    public void setSoTK(long soTK) {
        this.soTK = soTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public double getSoTienTrongTK() {
        return soTienTrongTK;
    }

    public void setSoTienTrongTK(double soTienTrongTK) {
        this.soTienTrongTK = soTienTrongTK;
    }

    @Override
    public String toString() {
        return "Account{" +
                "soTK=" + soTK +
                ", tenTK='" + tenTK + '\'' +
                ", soTienTrongTK=" + soTienTrongTK +
                '}';
    }

    public double napTien() {
        double nap;
        System.out.print("Nhap so tien ban can nap: ");
        nap = scanner.nextDouble();
        if (nap >= 0) {
            soTienTrongTK = nap + soTienTrongTK;
            System.out.println("Ban vua nap " + nap + " vao tai khoan.");
        } else {
            System.out.println("So tien nap vao khong hop le");
        }
        return nap;
    }

    public double rutTien() {
        double phi = 1000;
        double rut;
        System.out.print("Nhap so tien ban can rut: ");
        rut = scanner.nextDouble();
        if (rut <= (soTienTrongTK - phi)) {
            soTienTrongTK = soTienTrongTK - (rut + phi);
            System.out.println("Ban vua rut " + rut + " tu tai khoan. Phi la 1000");
        } else {
            System.out.println("So tien muon rut khong hop le!");
            return rutTien();
        }
        return rut;
    }

    public double daoHan() {
        final double laiSuat = 0.035;
        soTienTrongTK = soTienTrongTK + soTienTrongTK * laiSuat;
        System.out.println("Ban vua duoc dao han " + soTienTrongTK + " trong 1 thang");
        return soTienTrongTK;
    }

    void inTK() {
        System.out.printf("%-10d %-20s %-20s \n", soTK, tenTK, soTienTrongTK);
    }
}

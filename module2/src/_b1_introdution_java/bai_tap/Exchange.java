package _b1_introdution_java.bai_tap;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap so tien USD :");
        usd = scanner.nextDouble();
        double quydoi = usd * vnd;
        System.out.print("Gia tri VND : " + quydoi);
    }
}

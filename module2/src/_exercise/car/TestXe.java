package _exercise.car;

import java.util.Scanner;

public class TestXe {
    static Scanner sc = new Scanner(System.in);
    static void nhapXe(Xe xe){
        System.out.print("Nhap ma xe : ");
        xe.setMaXe(sc.nextInt());sc.nextLine();
        System.out.print("Nhap ten chu xe : ");
        xe.setChuXe(sc.nextLine());
        System.out.print("Nhap dung tich xe : ");
        xe.setDungTich(sc.nextInt());
        System.out.print("Nhap tri gia xe : ");
        xe.setTriGia(sc.nextDouble());;sc.nextLine();
        System.out.print("Mo ta : ");
        xe.setMoTa(sc.nextLine());
    }
    public static void main(String[] args) {
        Xe arr[]= null;
        int a,n=0;
        boolean flag = true;
        do{
            System.out.println("Menu ");
            System.out.println("1.Nhap thong tin \n"+
                    "2.Xuat bang ke khai tien thue cua xe.\n"+
                    "Nhap so khac de thoat. ");
            a =sc.nextInt();
            switch (a){
                case 1:
                    System.out.print("Nhap so luong xe ban muon khai bao thue: ");
                    n=sc.nextInt();
                    arr= new Xe[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Xe thu " + (i+1));
                        arr[i] = new Xe();
                        nhapXe(arr[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%5s %5s %5s %10s %10s %8s \n","Ma xe","Chu xe","Dung tich","Tri gia","Mo ta","Thue");
                    for (int i = 0; i < n; i++) {
                        arr[i].inThue();
                    }
                    break;
                default:
                    System.out.println("Exit");
                    flag=false;
                    break;
            }
        }while (flag);
    }
}

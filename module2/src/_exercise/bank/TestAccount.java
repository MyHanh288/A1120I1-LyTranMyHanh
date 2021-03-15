package _exercise.bank;

import java.util.Scanner;

public class TestAccount {
    static Scanner scanner = new Scanner(System.in);
    static void nhapTK(Account tk) {
        System.out.println("Nhap so tai khoan: ");
        tk.setSoTK(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhap ten tai khoan: ");
        tk.setTenTK(scanner.nextLine());
        tk.setSoTienTrongTK(50);
    }
    public static void main(String[] args) {
        Account a[] = null;
        int k, b, n = 0;
        long s, d, c, f;
        boolean flag = true;
        do {
            System.out.println("Menu: ");
            System.out.println("1.Nhap thong tin cua khach hanh\n"
                    + "2.Xuat thong tin cua khach hang\n" + "3.Nap tien\n" + "4.Rut tien\n"
                    + "5.Dao han\n" + "6.Chuyen khoan\n" + "Chon so khac de thoat");
            b = scanner.nextInt();
            switch (b) {
                case 1:
                    System.out.println("Nhap so luong khach hang ban muon nhap: ");
                    n = scanner.nextInt();
                    a = new Account[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Khach hang thu: " + (i+1));
                        a[i] = new Account();
                        nhapTK(a[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%-10s %-20s %-20s\n", "So TK", "Ten TK", "So tien trong TK");
                    for (int i = 0; i < n; i++) {
                        a[i].inTK();
                    }
                    break;
                case 3:
                    System.out.println("Nhap so tai khoan khach hang can nap tien: ");
                    s = scanner.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSoTK();
                        if (s == d) {
                            System.out.println("Ban chon tai khoan : " + d);
                            a[i].napTien();
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhap so tai khoan khach hang can rut tien: ");
                    s = scanner.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSoTK();
                        if (s == d) {
                            System.out.println("Ban chon tai khoan : " + d);
                            a[i].rutTien();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Nhap so tai khoan khach hang can dao han : ");
                    s = scanner.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSoTK();
                        if (s == d) {
                            System.out.println("Ban chon tai khoan: " + d);
                            a[i].daoHan();
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                case 6:
                    double chuyen,
                            nhan,
                            tienChuyen;
                    System.out.print("Nhap so tai khoan khach hang chuyen tien: ");
                    s = scanner.nextLong();
                    System.out.print("Nhap so tai khoan khach hang nhan tien: ");
                    c = scanner.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSoTK();
                        if (s == d) {
                            chuyen = a[i].getSoTienTrongTK();
                            for (int j = 0; j < n; j++) {
                                f = a[j].getSoTK();
                                if (c == f) {
                                    nhan = a[j].getSoTienTrongTK();
                                    System.out.println("Nhap so tien can chuyen : ");
                                    tienChuyen = scanner.nextDouble();
                                    if (tienChuyen <= chuyen) {
                                        chuyen = chuyen - tienChuyen;
                                        nhan = nhan + tienChuyen;
                                        a[i].setSoTienTrongTK(chuyen);
                                        a[j].setSoTienTrongTK(nhan);
                                        System.out.println("Tai khoan so " + d + " vua chuyen " + tienChuyen);
                                        System.out.println("Tai khoan so " + f + " vua nhan " + tienChuyen);
                                    } else {
                                        System.out.println("So tien nhap khong hop le. ");
                                    }
                                } else {
                                    System.out.println("");
                                }
                            }
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                default:
                    System.out.println("Exit");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}

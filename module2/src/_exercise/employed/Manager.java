package _exercise.employed;

import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employed[] workers = new Worker[10];
        Employed[] staffs = new Staff[10];
        Employed[] engineers = new Engineer[10];
        int m = 0;
        int n = 0;
        int p = 0;
        int i, kt;
        System.out.println("Nhap danh sach can bo: ");
        do
        {
            System.out.println("1: Nhap cong nhan");
            System.out.println("2: Nhap ky su");
            System.out.println("3: Nhap nhan vien phuc vu");
            System.out.println("0: Exit");
            kt = scanner.nextInt();
            if (kt==0)
            {
                System.out.println("Ket thuc nhap!");
            }
            else
            {
                if (kt==1)
                {
                    workers[++m] = new Worker();
                    workers[m].nhap();
                }
                else
                {
                    if (kt==2)
                    {
                        engineers[++n] = new Engineer();
                        engineers[n].nhap();
                   }
                    else
                    {
                        if (kt==3)
                        {
                            staffs[++p] = new Staff();
                            staffs[p].nhap();
                        }
                    }
                }
            }
        }while (kt!=0);

        System.out.println("Danh sach da nhap: ");
        System.out.println("Cong nhan: ");
        if (m==0)
        {
            System.out.println("Chua nhap cong nhan nao");
        }
        else
        {
            for (i=1;i<=m;i++)
            {
                engineers[i].xuat();
            }
        }
        System.out.println("Ky su: ");
        if (n==0)
        {
            System.out.println("Chua nhap ky su nao");
        }
        else
        {
            for (i=1;i<=n;i++)
            {
                engineers[i].xuat();
            }
        }
        System.out.println("Nhan vien: ");
        if (p==0)
        {
            System.out.println("Chua nhap nhan vien nao");
        }
        else
        {
            for (i=1;i<=p;i++)
            {
                staffs[i].xuat();
            }
        }

        System.out.println("\nTim kiem thong tin can bo theo ten: ");
        System.out.print("Nhap ten can tim: ");
        String c = scanner.nextLine();
        String ten= scanner.nextLine();
        kt=0;
        for (i=1;i<=m;i++)
        {
            if(engineers[i].getHoTen().equals(ten)==true)
            {
                kt=1;
                System.out.println("Can bo can tim la: ");
                engineers[i].xuat();
            }
        }
        if (kt!=1)
        {
            for (i=1;i<=n;i++)
            {
                if (engineers[i].getHoTen().equals(ten)==true)
                {
                    kt=1;
                    System.out.println("Can bo can tim la: ");
                    engineers[i].xuat();
                }
            }
            if (kt!=1)
            {
                for (i=1;i<=p;i++)
                {
                    if (staffs[i].getHoTen().equals(ten)==true)
                    {
                        kt=1;
                        System.out.println("Can bo can tim la: ");
                        staffs[i].xuat();
                    }
                }
            }
            if (kt!=1)
            {
                System.out.println("Khong tim thay ten vua nhap!");
            }
        }
    }
}

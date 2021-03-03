package _b3_array_method_java.bai_tap;

import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        int[] arr;
        int n, i;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);
        arr = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("mang cu ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Nhập số nguyên k: ");
        int k = scanner.nextInt();
        System.out.println("Nhập vị trí muốn chèn k vào trong mảng: ");
        int index = scanner.nextInt();

        int[] newArr = new int[arr.length + 1];
        for (i = 0; i<arr.length; i++) {
            newArr[i] = arr[i];
        }
        for(i=newArr.length-1;i>index;i--){
            newArr[i]=newArr[i-1];
        }
        newArr[index]=k;
        System.out.println("Mảng mới là: ");
        for (i=0;i<newArr.length;i++){
            System.out.println(newArr[i]+ " ");
        }

    }
}

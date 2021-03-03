package _b3_array_method_java.bai_tap;

import java.util.Scanner;

public class Add {
    public static int[] inputArray(){
        int[] arr;
        int n, i;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);
        arr = new int[n];
        return arr;
    }
    public static void main(String[] args) {

    }
}

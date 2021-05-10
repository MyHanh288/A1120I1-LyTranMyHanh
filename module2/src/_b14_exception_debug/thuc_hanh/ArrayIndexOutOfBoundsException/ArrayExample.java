package _b14_exception_debug.thuc_hanh.ArrayIndexOutOfBoundsException;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random random = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach phan tu cua mang : ");
        for(int index = 0; index<arr.length; index++){
            arr[index] = random.nextInt(100);
            System.out.println(arr[index] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scaner = new Scanner(System.in);
        System.out.println("\nVui long nhap chi so cua 1 phan tu bat ky : ");
        int x = scaner.nextInt();
        try {
            System.out.println("Gia tri cua phan tu co chi so " + x + " la " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chi so vuot qua gioi han cua mang. ");
        }
    }
}

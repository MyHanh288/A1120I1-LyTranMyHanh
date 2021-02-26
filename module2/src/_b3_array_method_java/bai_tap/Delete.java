package _b3_array_method_java.bai_tap;

import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.print("Enter number :");
        int input_number = scanner.nextInt();
        boolean isExist = false;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == (input_number)) {
                System.out.println("Position of " + input_number + " in the list is: " + (j + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Not found" + input_number + " in the list.");


    }
}

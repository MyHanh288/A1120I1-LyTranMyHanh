package _b12_searching_algorithms.bai_tap.ascii_table;

import java.util.LinkedList;
import java.util.Scanner;

public class AsciiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your string : ");
        String string = scanner.nextLine();
        LinkedList<Character> myList = new LinkedList<>();
        for(int index = 0; index<string.length(); index++){
            myList.add(string.charAt(index));
        }
        System.out.println(myList);

        LinkedList<Character> mysort = new LinkedList<>();
        for (int index = 0; index<myList.size()-1; index++){
            if(myList.get(index)<myList.get(index+1))
                mysort.add(myList.get(index));
        }
        System.out.println(mysort);
    }
}

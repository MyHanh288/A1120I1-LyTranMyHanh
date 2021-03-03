package _b4_oop_java.bai_tap.StopWatch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int [100000];
        for (int i=0; i<numbers.length; i++){
            numbers[i]=(int)(Math.random()*100000);
        }
        StopWatch stopWatch = new StopWatch();
        Arrays.sort(numbers);
        stopWatch.stop();
        System.out.println("Mills :" + stopWatch.getElapsedTime());
    }
}

package day15_ForLoops;

import java.util.Scanner;

public class minNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min= 2147483647;
        int num=0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a number");
            num= scanner.nextInt();
            if (min>num){
                min=num;
            }
        }
        System.out.println(min);
    }
}

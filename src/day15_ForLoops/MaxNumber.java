package day15_ForLoops;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        int max =-2147483648;

        int num=0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number.");
            num= scan.nextInt();
            if (max<num){
                max=num;
            }
                  }
        System.out.println(max);

    }
}

package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many number you wanna enter?");
        int num= scan.nextInt();
        int count=0;

        int [] numList = new int[num];

        if(num <= 0){
            System.err.println("Invalid Entry");
            System.exit(0);
        }

        for (int i = 0; i < num; i++) {
            System.out.println("Now enter a number:");

            numList[i] =  scan.nextInt();
        }

        System.out.println(Arrays.toString(numList));



        scan.close();


    }
}

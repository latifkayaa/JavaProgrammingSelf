package day20_Arrays;

import java.util.Scanner;

public class AverageNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers you want to enter?");
        int length = scan.nextInt();
        int [] list = new int[length];
        int sum=0;

        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter a number:");
            list [i]= scan.nextInt();

            sum+=list[i];

        }

        System.out.println(sum/length);

    }
}

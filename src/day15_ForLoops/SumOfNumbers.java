package day15_ForLoops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
       // sum of two different numbers
        Scanner scan = new Scanner (System.in);

        /* System.out.println("Enter the first number.");
        int num = scan.nextInt();

        System.out.println("Enter the second number.");
        int num2 = scan.nextInt();

        int sum = 0;

        for (int i= num; i<=num2; i++){
            sum +=i;
        }

        System.out.println(sum);
 */
        int num3=0;

        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Enter the " + i +". number.");
            num3 = scan.nextInt();
            num3 +=num3;
        }
        System.out.println(num3);

        scan.close();
    }
}

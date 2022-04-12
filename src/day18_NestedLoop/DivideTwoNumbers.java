package day18_NestedLoop;

import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("First number:");
        int num1 = scan.nextInt();
        System.out.println("Second number:");
        int num2 = scan.nextInt();
        int division = 0;
        int remainder = 0;

        while (num1 >= num2) {
            num1 -= num2;
            division++;

        }
        remainder = num1;
        System.out.println("remainder = " + remainder);
        System.out.println("division = " + division);




    }

}


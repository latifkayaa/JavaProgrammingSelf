package day17_WhileLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first number.");
        int num1 = scan.nextInt();
        System.out.println("Pleae enter your second number.");
        int num2= scan.nextInt();
        int sum1= (num1+num2)/2;

        System.out.println(sum1);
        System.out.println("Do you wanna continue calculating sum of two numbers? Yes or No.");
        String answer = scan.next();

        while ((answer.equalsIgnoreCase("yes"))){
            System.out.println("Enter first number again:");
            num1 = scan.nextInt();
            System.out.println("Enter second number again:");
            num2 = scan.nextInt();
            sum1=  (num1+num2)/2;
            System.out.println(sum1);
            System.out.println("Do you wanna continue calculating sum of two numbers? Yes or No.");
            answer = scan.next();
        }
        System.out.println("Calculations are over.");

        scan.close();
    }

}

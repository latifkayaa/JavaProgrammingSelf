package day17Tasks;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number to multiply.");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number to multiply.");
        int num2 = scan.nextInt();
        int multiplied=0;
        int base=1;

        while(base<=num1){
            multiplied +=num2;
            base++;
        }

        System.out.println(multiplied);

    }
}

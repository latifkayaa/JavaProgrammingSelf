package week06;

import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int upper = scan.nextInt();
        int sum=0;
        for (int i = 0; i <=upper ; i++) {
            sum +=i;
        }
        System.out.println("sum = " + sum);



        System.out.println("Enter a valid upper bound :");
        int upperBound = scan.nextInt();

        int total = 0;
        boolean check = true;
        for( ; check ; ) {
            if (upperBound >= 1) {
                for (int i = 1; i <= upperBound; i++) {
                    total += i;
                }
                check = false;
            } else {
                System.out.println("Please Enter a Valid Number Again : ");
                upperBound = scan.nextInt();
            }
        }
        System.out.println("total = " + total);



    }
}

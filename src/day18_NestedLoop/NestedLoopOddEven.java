package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopOddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number.");
            int num1 = scan.nextInt();

            if (num1 % 2 == 0) {
                System.out.println("Even number.");
            } else {
                System.out.println("Odd number.");
            }

            System.out.println("Would you like to enter another number?");
            String answer = scan.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid answer. Please re-enter.");
                answer = scan.next().toLowerCase();

            }
            if(answer.equals("no")){
                break;
            }


        }


    }
}

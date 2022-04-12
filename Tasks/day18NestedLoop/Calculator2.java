package day18NestedLoop;

import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Enter your first number:");
            int num1 = scan.nextInt();
            System.out.println("Enter your second number:");
            int num2 = scan.nextInt();

            System.out.println("Enter a math operator:");
            char ch = scan.next().charAt(0);

            double result = 0;

            if (ch == '-') {
                result = num1 - num2;
            } else if (ch == '+') {
                result = num1 + num2;
            } else if (ch == '*') {
                result = num1 * num2;
            } else {
                result = num1 / num2;
            }

            while(!(ch=='+' ||ch=='-' ||ch=='/' ||ch=='*')){
                System.out.println("Enter a valid math operator: ");
                ch = scan.next().charAt(0);
            }

            System.out.println(result);

            System.out.println("Do you want to continue?");
            String a= scan.next().toLowerCase();

            while(!(a.equals("no") || a.equals("yes"))){
                System.out.println("Invalid answer try again.");
                a= scan.next().toLowerCase();
            }

        if(a.equals("no")){
            break;
        }



        }








    }
}

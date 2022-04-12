package day17Tasks;

import java.util.Scanner;

public class MathOperator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number.");
        int num1= scan.nextInt();
        System.out.println("Enter the second number.");
        int num2= scan.nextInt();
        System.out.println("Which mathematical operator you're gonna use?");
        char ch = scan.next().charAt(0);

        while(!(ch=='+' ||ch=='-' ||ch=='/' ||ch=='*')){
            System.out.println("Enter a valid math operator: ");
            ch = scan.next().charAt(0);
        }

        if(ch == '+'){
            System.out.println("Sum is:" + (num1+num2));
        }
        else if(ch == '-'){
            System.out.println("Difference is:" + (num1-num2));
        }
        else if(ch == '/'){
            System.out.println("Division is:" + (num1/num2));
        }
        else {
            System.out.println("Multiplication is:" + (num1*num2));
        }



    }
}

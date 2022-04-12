package day17_WhileLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number.");
        int num1= scanner.nextInt();
        System.out.println("Enter second number.");
        int num2 = scanner.nextInt();

        System.out.println("Enter a math operator: + - / *");
        char ch = scanner.next().charAt(0);

        while(!(ch == '+' || ch == '-' || ch== '/' || ch== '*')){
            System.out.println("Invalid operator. Please re-enter:");
            ch= scanner.next().charAt(0);
        }
        if(ch== '+'){
            System.out.println(num1+num2);
        }
        else if (ch == '-'){
            System.out.println(num1-num2);
        }else if (ch == '/'){
            System.out.println(num1/num2);
        }
        else {
            System.out.println(num1*num2);
        }
    }
}

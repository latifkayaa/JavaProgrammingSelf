package week06;

import java.util.Scanner;

public class Fibonacchi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a upper bound for fibonacchi series.");

        int n = scan.nextInt();
        int firstNum = 0, secondNum = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstNum + ", ");

            // compute the next term
            int nextTerm = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextTerm;
        }





    }
}

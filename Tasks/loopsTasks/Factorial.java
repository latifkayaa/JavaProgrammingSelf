package loopsTasks;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number to get the factorial of the number.");
        int num = scan.nextInt();
        long fac=1l;

        for (int i = 1; i <=num ; i++) {
            fac*=i;
        }
        System.out.println("fac = " + fac);
    }
}

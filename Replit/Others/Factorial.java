package Others;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fact=1;

        for (int i = n; n>=1 ; i--) {
           fact = fact*i;
        }
        System.out.println(fact);
    }
}

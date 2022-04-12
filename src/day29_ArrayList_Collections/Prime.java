package day29_ArrayList_Collections;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime number.");
        } else {
            System.out.println("Not a prime number.");
        }

    }
}

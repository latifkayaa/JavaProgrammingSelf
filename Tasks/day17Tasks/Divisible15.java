package day17Tasks;

import java.util.Scanner;

public class Divisible15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = scan.nextInt();
        String divisible15 = "";
        String divisible5 = "";
        String divisible3 = "";

        for (int i = 1; i <= num; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                divisible15 += i + " ";
            } else if (i % 5 == 0) {
                divisible5 += i + " ";
            } else if (i % 3 == 0) {
                divisible3 += i + " ";
            }

        }
        System.out.println("Divisible by 15 " + divisible15);
        System.out.println("Divisible by 5 " + divisible5);
        System.out.println("Divisible by 3 " + divisible3);

        scan.close();
    }
}

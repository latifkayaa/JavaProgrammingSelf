package day12_Scanner;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {
        /*Write a program that can convert Miles to KM
        Enter miles: 10.0
        output:    10.0 miles equal to 16.09 kilometers */
        Scanner scan = new Scanner(System.in);

        double miles = scan.nextDouble();
        double km = 1.69 * miles;
        System.out.println(km);
    }
}

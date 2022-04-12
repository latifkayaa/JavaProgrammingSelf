package week07;

import java.util.Scanner;

public class TaskOscar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many rows?");
        int row = scan.nextInt();
        int value=0;

        for (int i = 1; i <= row; i++) {
            value =i;
            for (int j = 1; j <= i; j++) {

                System.out.print(value + " ");
                value = value + row - j;
            }
            System.out.println();

        }

    }
}

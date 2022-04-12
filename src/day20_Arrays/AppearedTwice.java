package day20_Arrays;

import java.util.Scanner;

public class AppearedTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many time you're gonna input letter: ");
        int length = scan.nextInt();

        char[] letters = new char[length];

        for (int i = 0; i < letters.length; i++) {
            System.out.println("Enter a letter:");
            letters[i] = scan.next().charAt(0);
        }

        String twiceLetters = "";

        for (int i = 0; i < letters.length; i++) {
            char ch = letters[i];
            int count = 0;

            for (int j = 0; j < letters.length; j++) {
                char each = letters[j];

                if (ch == each) {
                    count++;
                }
            }

            if (count == 2) {
                twiceLetters += ch + ", ";
            }
        }

        System.out.println("twiceLetters = " + twiceLetters);

    }
}

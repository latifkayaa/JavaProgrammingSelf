package day21_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str1= scan.next();
        System.out.println("Enter another word:");
        String str2= scan.next();

        char [] each1 = str1.toCharArray();
        char [] each2 = str2.toCharArray();

        Arrays.sort(each1);
        Arrays.sort(each2);

        boolean check = Arrays.equals(each1, each2);
        System.out.println("check = " + check);

    }
}

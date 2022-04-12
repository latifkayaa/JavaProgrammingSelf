package day16_ForLoopStringPractice;

import java.util.Scanner;

public class UniqueChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word.");
        String word = scan.next();

        int length = word.length();
        String removed = "";

        for (int i = 0; i < length; i++) {
            String ch = ""+ word.charAt(i);
            if (word.indexOf(ch) == word.lastIndexOf(ch)){
                removed += word.charAt(i);
            }
        }
        System.out.println(removed);

    }
}

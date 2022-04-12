package day21_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAndPhyton {
    public static void main(String[] args) {
        //Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many words you want to input:");
        int length = scan.nextInt();

        String [] words = new String[length];

        for (int i = 0; i < words.length; i++) {
            System.out.println("Enter a word:");
            words[i] = scan.next();
        }
        System.out.println(Arrays.toString(words));

        int countJava=0, countPhyton=0;

        for (String word : words) {
            if(word.equalsIgnoreCase("java")){
                countJava++;
            }
            else if(word.equalsIgnoreCase("phyton")){
                countPhyton++;
            }

        }

        System.out.println("countJava = " + countJava);
        System.out.println("countPhyton = " + countPhyton);

    }
}

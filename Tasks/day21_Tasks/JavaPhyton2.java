package day21_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class JavaPhyton2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a sentence:");
        String sentence = scan.nextLine();


        String [] words = sentence.split(", ");
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

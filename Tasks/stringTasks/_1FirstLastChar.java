package stringTasks;

import java.util.Scanner;

public class _1FirstLastChar {
    public static void main(String[] args) {
       /*write a program that asks user to enter a sentence.
        then print the first & last characters of the sentence*/

        Scanner scan= new Scanner(System.in);
        String sentence =scan.nextLine();
        int length = sentence.length();

        char firstChar=sentence.charAt(0);
        char lastChar= sentence.charAt(length-1);

        System.out.println("firstChar = " + firstChar);
        System.out.println("lastChar = " + lastChar);

        scan.close();
    }


}

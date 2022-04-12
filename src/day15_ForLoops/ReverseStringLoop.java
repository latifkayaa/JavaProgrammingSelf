package day15_ForLoops;

import java.util.Scanner;

public class ReverseStringLoop {
    public static void main(String[] args) {
        //turn a string to reverse

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word.");
        String word = scan.nextLine();
        int length= word.length();
        String reverse ="";

        for (int i = length-1; i >=0; i--) {
            reverse += word.charAt(i);
        }
        System.out.println(reverse);

    }
}

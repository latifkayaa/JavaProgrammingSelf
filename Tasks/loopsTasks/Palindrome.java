package loopsTasks;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");

        String word = scan.next();
        int length = word.length()-1;
        String reversed = "";

        for (int i = length; i>=0; i--) {
            reversed += word.charAt(i);
        }

        if (word.equalsIgnoreCase(reversed)){
            System.out.println("Palindrome.");;
        }
        else {
            System.out.println("Not palindrome.");
        }

    }
}

package week05;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //Check if a string is palindrome or not
        //0 == length-1
        //1== length-2
        //2==length-3
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
     /*   String word = scan.next();

        if (word.length()!=5){
            System.out.println("Please enter a word that contains 5 letters.");
        }

       if (word.charAt(0) == word.charAt(word.length()-1) && word.charAt(1) == word.charAt(word.length()-2)){
           System.out.println("Palindrome.");
       }
       else
           System.out.println("not palindrome");*/
        //çift ise 012345 0=5 1=4 2=3
        //tek ise 01234 0==4 1==3

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

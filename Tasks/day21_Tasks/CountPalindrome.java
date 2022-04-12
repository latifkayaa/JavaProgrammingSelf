package day21_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class CountPalindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many words you want to input:");
        int length = scan.nextInt();

        String [] words = new String[length];

        for (int i = 0; i < words.length; i++) {
            System.out.println("Enter a word:");
            words[i] = scan.next();
        }
        System.out.println(Arrays.toString(words));

        int count=0;

        for (String word : words) {
            String reversed = "";
            for (int i = word.length()-1; i>=0; i--) {
                reversed += word.charAt(i)+ "";
            }
            if(word.equals(reversed)){
                count++;
            }

        }

        System.out.println("count of palindrome words = " + count);

    }
}

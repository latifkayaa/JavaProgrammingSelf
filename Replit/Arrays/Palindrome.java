package Arrays;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str = scan.next();
        String check = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            check += str.charAt(i) + "";
        }
        if(check.equals(str)){
            System.out.println("It's a palindrome word.");
        }
        else {
            System.out.println("It's not a palindrome word.");
        }

    }
}

package stringTasks;

import java.util.Scanner;

public class _2LongestString {
    public static void main(String[] args) {
        /*write a program that asks user to enter two strings, and print out the longest string   */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first sentence:");
        String sentence1= scan.nextLine();

        System.out.println("Enter the second sentence:");
        String sentence2 = scan.nextLine();

        int length1= sentence1.length();
        int length2=sentence2.length();
        if (length1<length2){
            System.out.println("The longest string is: " + sentence2);
        }
        else{
            System.out.println("The longest string is: " + sentence1);
        }
        scan.close();
    }
}

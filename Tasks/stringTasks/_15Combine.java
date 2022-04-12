package stringTasks;

import java.util.Scanner;

public class _15Combine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first word.");
        String word1 = scan.next();
        System.out.println("Enter the second word.");
        String word2 = scan.next();

        int length1= word1.length();
        String combined= "";
        if(word1.substring(length1-1).equals(word2.substring(0,1))){
            combined = word1.substring(0,length1-2) + word2;
            System.out.println(combined);
        }
        else {
            combined = word1+ word2;
            System.out.println(combined);
        }
    }
}

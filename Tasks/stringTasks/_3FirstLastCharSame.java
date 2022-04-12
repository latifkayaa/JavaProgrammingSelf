package stringTasks;

import java.util.Scanner;

public class _3FirstLastCharSame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your sentence.");
        String sentence = scan.nextLine();
        int length = sentence.length();

        if(sentence.charAt(0) == (sentence.charAt(length-1))){
            System.out.println("First and last chars are the same.");
        }
        else {
            System.out.println("First and last chars are different.");
        }




    }
}
/*write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same */
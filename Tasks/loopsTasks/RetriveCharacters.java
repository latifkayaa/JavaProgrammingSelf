package loopsTasks;

import java.util.Scanner;

public class RetriveCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word.");
        String word = scan.next();
        int length = word.length();

        String letters= "";
        String digits= "";
        String specialCharacters= "";


        for (int i = 0; i <length ; i++) {
                if (word.charAt(i)<=47  && word.charAt(i)>=33){
                specialCharacters += word.charAt(i);
                }
                else if (word.charAt(i)<=57  && word.charAt(i)>=48){
                    digits += word.charAt(i);
                }
                else if (word.charAt(i)<=122  && word.charAt(i)>=65){
                    letters += word.charAt(i);
                }
                else {
                    System.out.println("Please enter a word.");
                }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialCharacters = " + specialCharacters);
    }
}

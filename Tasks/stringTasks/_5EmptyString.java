package stringTasks;

import java.util.Scanner;

public class _5EmptyString {
    public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
      String sentence = scan.nextLine();
      int length = sentence.length();
      if (length==0){
          System.out.println("String is empty.");
      }
      else if(length<=3 && length>0){
          System.out.println(sentence);
      }
      else {
          String str= sentence.substring((length)-3);
          System.out.println(str);
      }

    }
}
/* Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
*/
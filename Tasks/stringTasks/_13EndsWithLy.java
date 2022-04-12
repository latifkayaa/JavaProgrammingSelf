package stringTasks;

import java.util.Scanner;

public class _13EndsWithLy {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        int length = word.length();
        if (word.substring(length-2).equals("ly")){
            System.out.println("Really?");
        }
        else {
            System.out.println("Never mind.");
        }



    }
}

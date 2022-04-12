package day16_ForLoopStringPractice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class WarmUpRemoveDuplicate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word.");
        String word = scan.next();

        String removed = "";

        for (int i = 0; i < word.length(); i++) {
            String ch = ""+ word.charAt(i);

            if (!removed.contains(ch)){
                removed += ch;
            }


            }
        System.out.println(removed);

    }
}

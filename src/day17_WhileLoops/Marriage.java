package day17_WhileLoops;

import day03_EscapeSequences.EscapeSequences;

import java.util.Locale;
import java.util.Scanner;

public class Marriage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Will you marry me?");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))){
            System.out.println("Invalid answer, please re-enter: only yes or no.");
            answer = scan.next();
        }

        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Congrats.");
        }
        else {
            System.out.println("Goodbye.");
        }



    }
}

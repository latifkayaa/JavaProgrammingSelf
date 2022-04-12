package Arrays;

import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below

        String [] words = sentence.split(" ");

        for (String word : words) {
            System.out.println(word);
        }


    }
}

package Arrays;

import java.util.Scanner;

public class FindingMaxLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];

        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();
        }
        String longest = "";

        for (String word : words) {
            longest = word;

            for (String s : words) {
                if (word.length()<s.length()){
                    longest = s;
                }
            }

        }
        System.out.println(longest);


    }
}

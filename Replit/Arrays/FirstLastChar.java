package Arrays;

import java.util.Scanner;

public class FirstLastChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for (String word : words) {
            System.out.println(word.substring(0,1)+ word.substring(word.length()-1));
        }

    }
}

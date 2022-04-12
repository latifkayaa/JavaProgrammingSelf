package day17_WhileLoops;

import java.util.Scanner;

public class FrequencyOfAChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char letter = scanner.next().charAt(0);
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == letter){
                count++;
            }
        }

        System.out.println("count = " + count);
    }
}

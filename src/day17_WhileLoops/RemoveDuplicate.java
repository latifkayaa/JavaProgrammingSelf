package day17_WhileLoops;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String result="";

        for (int i = 0; i < word.length(); i++) {
            String ch= ""+ word.charAt(i);

            if(result.contains(ch)){
                continue;
            }

            result+=ch;

        }

        System.out.println(result);


    }
}

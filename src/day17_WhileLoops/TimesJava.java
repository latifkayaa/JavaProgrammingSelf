package day17_WhileLoops;

import java.util.Scanner;

public class TimesJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int count=0;
        for (int i = 0; i < word.length()-3 ; i++) {
            if(word.substring(i,i+4).equalsIgnoreCase("java")){
                count++;
            }
        }
        System.out.println(count);
    }
}

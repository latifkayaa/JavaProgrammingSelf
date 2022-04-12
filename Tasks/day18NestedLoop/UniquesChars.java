package day18NestedLoop;

import java.util.Scanner;

public class UniquesChars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String result = "";
        int length = word.length();

        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);
            int count = 0;

            for (int j = 0; j < length; j++) {
                char same = word.charAt(j);

                if (same == ch) {
                    count++;
                }
            }

            if(count==1){
                result+=""+ch;
            }

        }
        System.out.println(result);

    }
}

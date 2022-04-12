package day19_LoopsAndStrings;

import java.util.Scanner;

public class Twice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str = scan.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);

                if (ch == each) {
                    count++;
                }
            }

            if (count == 2) {
                if (result.contains("" + ch)) {
                    continue;
                }
                result += ch;
            }
        }
        System.out.println(result);

    }
}

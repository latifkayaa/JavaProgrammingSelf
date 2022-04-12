package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestElement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] words = str.split(", ");

        String shortest = "";

        for (String word : words) {
            shortest = word;

            for (String s : words) {
                if (word.length() > s.length()) {
                    shortest = s;
                }
            }

        }

        int count = 0;
        for (String each : words) {
            if (each.length() == shortest.length()) {
                count++;
            }
        }

        String[] s = new String[count];

        int i = 0;
        for (int j = 0; j < words.length; j++) {

            if (words[j].length() == shortest.length()) {
                s[i] = words[j];
                i++;
            }

        }

        Arrays.sort(s);
        System.out.println(Arrays.toString(s));

    }
}

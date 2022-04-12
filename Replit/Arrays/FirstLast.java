package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLast {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        String[] firstLast = new String[words.length];

        int i=0;

        for (String word : words) {
            firstLast[i++]= word.substring(0,1) + word.substring(word.length()-1);
        }

        System.out.println(Arrays.toString(firstLast));

    }
}

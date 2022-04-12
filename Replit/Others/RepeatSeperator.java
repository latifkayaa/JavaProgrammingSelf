package Others;

import java.util.Scanner;

public class RepeatSeperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        int wordLength= word.length();
        int lengthSep= separator.length();

        String combined= "";

        for (int i = 0; i < count; i++) {
            combined+= word;
            if(i==count-1){
                break;
            }
            combined+=separator;
        }
        System.out.println(combined);
    }
}

package day19_LoopsAndStrings;

import java.util.Scanner;

public class FrequencyOfAChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word.");
        String str = scan.nextLine();
        String reserved= "";

        for (int i = 0; i < str.length(); i++) {
            int count=0;
            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if (ch == each){
                    count++;
                }
            }

            if(reserved.contains(""+ch)){
                continue;
            }
            reserved += ch;
            reserved +=count;

            if((str.contains(""+ch))){
            }

        }

        System.out.println("reserved = " + reserved);

    }
}

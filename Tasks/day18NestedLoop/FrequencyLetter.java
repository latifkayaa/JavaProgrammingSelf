package day18NestedLoop;

import java.util.Scanner;

public class FrequencyLetter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word.");
        String word = scan.next();
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int frequency = 0;

            for (int j = 0; j < word.length(); j++) {
                char each = word.charAt(j);
                if(ch==each){
                    frequency++;
                }
            }

            if(result.contains(""+ch)){
                continue;
            }
            result+=ch;
            result+=frequency;




        }
        System.out.println(result);


    }
}

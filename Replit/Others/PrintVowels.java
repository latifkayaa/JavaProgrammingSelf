package Others;

import java.util.Scanner;

public class PrintVowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below
        String vowels= "aeıioöuü";


        for (int i = 0; i < word.length(); i++) {
            if(vowels.contains(word.substring(i,i+1))){
                System.out.print(word.charAt(i));
            }
        }
    }
}

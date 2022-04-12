package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = " Java ";
        char [] each = str.toCharArray();
        System.out.println(Arrays.toString(each));

        for(char ch : str.toCharArray()) {
            System.out.print(ch + " ");
        }
        System.out.println("------------\n");

        String str2= "I love learning java programming language";

        String[] words = str2.split(" ");
        System.out.println(Arrays.toString(words));


    }
}

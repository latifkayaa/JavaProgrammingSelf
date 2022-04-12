package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice3 {

    public static void main(String[] args) {


        char [] letters = new char[26]; //Z-A


        for (char i = 0, j= 'Z'; j>='A' ; i++, j--) {
            letters[i]= j;
        }
        System.out.println(Arrays.toString(letters));



    }
}

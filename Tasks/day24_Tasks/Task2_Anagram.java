package day24_Tasks;

import java.util.Arrays;

public class Task2_Anagram {
    public static void main(String[] args) {
/*2. create a method named isAnagram that passes two String parameters,
the method returns true if the given two strings are anagram, otherwise returns false
Ex:str1 = "cba"     str2 = "bac";
isAnagram(str1, str2) ====> true */
        String str1 = "listen";
        String str2 = "Silent";

        boolean check = anagram(str1,str2);
        System.out.println("The words are anagram = " + check);

    }
    public static boolean anagram (String word1, String word2){
        char [] each1 = word1.toCharArray();
        char [] each2 = word2.toCharArray();
        Arrays.sort(each1);
        Arrays.sort(each2);
        if(Arrays.equals(each1,each2)){
            return true;
        }
        return false;


    }
}

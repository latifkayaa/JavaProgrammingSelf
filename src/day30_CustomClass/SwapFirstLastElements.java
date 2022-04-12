package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapFirstLastElements {
    public static void main(String[] args) {


        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println(nums);
        Collections.swap(nums, 0, nums.size() - 1);
        System.out.println(nums);

        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> allLetters = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            allLetters.add(str.charAt(i));
        }

        /*ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();

        for (Character ch : allLetters) {
            if (Character.isDigit(ch)) {
                digits.add(ch);
            } else if (Character.isLetter(ch)) {
                letters.add(ch);
            } else {
                specialChars.add(ch);
            }

        }   */
        ArrayList<Character> letters = new ArrayList<>( allLetters ); // add all the characters

        letters.removeIf( p -> !Character.isLetter(p)  ) ; //remove the characters that are not letters

        System.out.println("letters = " + letters);


        ArrayList<Character> digits = new ArrayList<>( allLetters ); // add all the characters
        digits.removeIf( p -> !Character.isDigit(p)); //remove the characters that are not digits

        System.out.println("digits = " + digits);

        ArrayList<Character> specialChar = new ArrayList<>( allLetters);

        // specialChar.removeAll( letters );
        //  specialChar.removeAll( digits );
        specialChar.removeIf( p ->  Character.isLetterOrDigit(p) );

        System.out.println("specialChars = " + specialChar);


    }
}

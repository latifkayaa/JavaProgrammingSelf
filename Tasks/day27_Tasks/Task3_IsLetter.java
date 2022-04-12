package day27_Tasks;

import java.util.Scanner;

public class Task3_IsLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        retrieve(word);

    }

    public static void retrieve(String str) {
        String letters = "";
        String digits = "";
        String specialChars = "";


        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digits +=str.charAt(i);
            }
            else if (Character.isLetter(str.charAt(i))) {
                letters +=str.charAt(i);
            }
            else{
                specialChars+=str.charAt(i);
            }
        }
        System.out.println("letters=" + letters);
        System.out.println("specialChars=" + specialChars);
        System.out.println("digits = " + digits);
    }

}

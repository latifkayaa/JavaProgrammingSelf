package day27_Tasks;

import java.util.Scanner;

public class Task4_UpperLower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        boolean chech = isEqual(word);
        System.out.println("chech = " + chech);


    }

    public static boolean isEqual (String str){
        int countUp= 0;
        int countLow=0;
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(Character.isLowerCase(each)){
                countLow++;
            }
            if(Character.isUpperCase(each)){
                countUp++;
            }
        }
        if (countLow==countUp)
            return true;
        return false;
    }


}

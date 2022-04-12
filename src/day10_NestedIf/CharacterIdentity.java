package day10_NestedIf;

import java.util.Scanner;

public class CharacterIdentity {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        char x = scan.next().charAt(0);

        if (x >= 48 && x <=57){
            System.out.println("Digit");
        }

        else if (x <= 122 && x >= 97 ||x <= 90 && x >=65 ){
            System.out.println("Alphabetic");
        }
        else {
            System.out.println("Special Character");
        }





    }
}

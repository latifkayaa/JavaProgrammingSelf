package week06;

import java.util.Scanner;

public class EncryptPassword {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String password= scan.next();
        String encryptedPassword= "";

        for(int i=0; i<password.length(); i++){
            encryptedPassword += password.charAt(i)+ "x";

        }
        System.out.print(encryptedPassword);

    }
}

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SplitMail {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //TODO: Write your code below

        char[] ch = email.toCharArray();

        int count =0;

        for (char c : ch) {
            if(c== '@'){
                count++;
            }
        }

        if (count>1 || count<1){
            System.out.println("invalid email");
            System.exit(0);
        }

        String [] split = email.split("@");

        System.out.println("Email id: "+ split[0] + "\nEmail domain: " + split[1]);
    }
}

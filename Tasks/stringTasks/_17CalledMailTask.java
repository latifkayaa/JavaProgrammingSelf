package stringTasks;

import java.util.Scanner;

public class _17CalledMailTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your e-mail.");
        //_ charat , @ charat

        String email= scan.next();
        int underscore= email.indexOf("_");
        int atSymbol= email.indexOf("@");

        if(email.contains("_")){
            email = email.substring(underscore+1, atSymbol) + "_" + email.substring(0,underscore)+ email.substring(atSymbol);
            System.out.println(email);
        }
        else{
            System.out.println(email);
        }


        scan.close();

    }
}
/*Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.
        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.
            Ex: input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
*/
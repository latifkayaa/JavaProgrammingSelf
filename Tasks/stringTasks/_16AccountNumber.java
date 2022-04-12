package stringTasks;

import java.util.Scanner;

public class _16AccountNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an account number:");
        String accountNum = scan.next();
        int length = accountNum.length();
        if ((accountNum.substring(0, 1).equals("2") && length == 7)||
             accountNum.substring(0,1).equals("5") && length==10) {
            System.out.println(accountNum + " is a valid account number.");
        }
        else {
            System.out.println("Invalid account number.");
        }


        scan.close();


    }
}

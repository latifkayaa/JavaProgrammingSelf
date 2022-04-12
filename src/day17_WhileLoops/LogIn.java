package day17_WhileLoops;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        //username: "Cydeo"; password: "Cydeo123"; 3 attempt fails, your account is locked.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = scan.next();
        System.out.println("Enter your password: ");
        String password = scan.next();

        if (username.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println("Logged in.");
        }
        else {

            int attempt = 3;

            while (!(username.equals("Cydeo") && password.equals("Cydeo123")) && attempt > 0) {
                if(attempt==1){
                    System.out.println("THIS IS YOUR LAST CHANCE.");
                }
                System.out.println("Incorrect username or password. Please re-enter.");
                System.out.println("Enter your username again: ");
                username = scan.next();
                System.out.println("Enter your password again : ");
                password = scan.next();
                attempt--;
            }

            if (username.equals("Cydeo") && password.equals("Cydeo123")) {
                System.out.println("Logged in.");
            }
            else {
                System.out.println("Your account is locked.");
            }

        }


    }
}

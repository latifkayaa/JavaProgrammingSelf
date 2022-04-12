package stringTasks;

import java.util.Scanner;

public class _8Login {
    public static void main(String[] args) {
        String username = "lkayaa";
        String password = "Ha.hty12$";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String inputUsername = scan.nextLine();
        System.out.print("Enter your password: ");
        String inputPassword = scan.nextLine();
        if (username.equals(inputUsername) & password.equals(inputPassword)) {
            System.out.println("Logged in.");
        } else {
            System.out.println("Incorrect username or password");
        }
    }
}
/*You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
username: Cydeo     password: WoodenSpoon
Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
otherwise print "Incorrect username or password" as error message
Hints: 	In order to login, both username and password MUST be correct
you will need to use equals() method */
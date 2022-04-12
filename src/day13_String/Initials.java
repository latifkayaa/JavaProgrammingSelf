package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name.");
        String firstName = scan.next();

        System.out.println("Enter your last name.");
        String lastName = scan.next();

        char firstInitial= firstName.charAt(0);
        char lastInitial= lastName.charAt(0);

        String initial= firstInitial + "." + lastInitial;

        System.out.println("Name's first initial is = " + firstInitial);
        System.out.println("Last name's first initial is = " + lastInitial);
        System.out.println("initial = " + initial);

        scan.close();
    }
}

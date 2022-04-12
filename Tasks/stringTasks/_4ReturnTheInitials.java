package stringTasks;

import java.util.Scanner;

public class _4ReturnTheInitials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string literal.");
        String str= scan.nextLine();

        char firstInitial= str.charAt(0);
        int spaceIndex= str.indexOf(" ");
        char secondInitial= str.charAt(spaceIndex+1);
        String str2= ""+ firstInitial+ "."+ secondInitial;
        str2= str2.toUpperCase();
        System.out.println("str2 = " + str2);
    }
}
/* write a program that can return the initials of the user
            ex: cybertek school
            output:C.S
        Note: Pay attention to the example output */
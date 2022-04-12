package day20Arrays;

import java.util.Scanner;

public class Classmates {

    public static void main(String[] args) {

        //create an array named classmates, and store 10 of your classmates'
        //full names
        //print the initials of each classmates in separate lines


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 of your classmates names:");

        String [] names = new String[10];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter the name:");
            names[i]= scan.next();
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i].substring(0,1));
        }



    }
}

package day17Tasks;

import java.util.Locale;
import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to reserve a room?");
        String a = scan.next().toLowerCase();
        String type = "";

        while (!(a.equals("no") || a.equals("yes"))) {
            System.out.println("PLease enter only yes or no.");
            a = scan.next().toLowerCase();
        }


        if (a.equals("no")) {
            System.out.println("Have a nice day.");
        } else {
            System.out.println("Which type room do you want?");
            type = scan.nextLine();
            while (!(type.equals("King Bed") || type.equals("Queen Bed") || type.equals("Single Bed"))) {
                System.out.println("Enter a valid room type: King Bed, Queesn Bed or Single Bed");
                type = scan.nextLine();
            }
            if (type.equals("King Bed")) {
                System.out.println("120$");
            } else if (type.equals("Queen Bed")) {
                System.out.println("100$");
            } else {
                System.out.println("80$");
            }

        }

        scan.close();
    }
}

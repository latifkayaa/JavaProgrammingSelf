package week04;

import java.util.Scanner;

public class AdaireApartments {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the bedroom.");
        int bedroom = scan.nextInt();
        int rent = 0;

        switch (bedroom) {
            case 0:
                System.out.println("Studio apartment selected.");
                rent = 1700;
                System.out.println("rent = " + rent);
                break;
            case 1:
                System.out.println("One bedroom apartment selected.");
                rent = 1900;
                System.out.println("rent = " + rent);
                break;
            case 2:
                System.out.println("Two bedroom selected.");
                rent = 2500;
                System.out.println("rent = " + rent);
                break;
            default:
                System.out.println("Please enter a valid bedroom.");

        }
    }
}

package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name.");
        String name = scan.nextLine();

        System.out.println("Enter your building number.");
        int buildingNum= scan.nextInt();;

        scan.nextLine();
        System.out.println("Enter your street name.");
        String streetName= scan.nextLine();

        System.out.println("Enter your city name.");
        String city= scan.next();

        System.out.println("Enter your state.");
        String state = scan.next();

        System.out.println("Enter your zipcode.");
        int zipCode = scan.nextInt();

        String shippingAddress= name + "\n" + buildingNum + "\n" + streetName + "\n" + city + "\n" + state + "\n" +zipCode;

        System.out.println("shippingAddress =\n" + shippingAddress);


    }
}

package day12_Scanner;

import java.util.Scanner;

public class PlaceOrder {
    public static void main(String[] args) {
        /*PlaceAnOrder task:
         Ask User to enter the prodcut name (multiple words)  Ask the user to enter the price  (double)
         Ask the user to enter the quantity (int) Ask the user to enter their first name (String, single word)
         Print in the following format:  Ex: Input: "Apples" , 1.5, 5. "Luke"   Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5. */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a product:");
        String product = scan.nextLine();

        System.out.println("Please enter the price:");
        double price = scan.nextDouble();

        System.out.println("Please enter how many you want:");
        int  quantity = scan.nextInt();

        System.out.println("Please enter your name.");
        String name = scan.next();

        double totalPrice = price * quantity;

        System.out.println(name + " your order for "+ quantity + " " + product +
                " has been placed. Your total is " + totalPrice );
    }
}

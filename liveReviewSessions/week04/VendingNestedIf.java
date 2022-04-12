package week04;

import java.util.Scanner;

public class VendingNestedIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String selection = scan.nextLine();
        String item = scan.nextLine();

        if (selection.equals("drink")){
            if (item.equals("tea")){
                System.out.println("Tea.");
            }
            else if (item.equals("coke")){
                System.out.println("Coke.");
            }
            else {
                System.out.println("Please enter a valid drink.");
            }
        }
        else if (selection.equals("snack")) {
            if (item.equals("chips")){
                System.out.println("Chips.");
            }
            else if (item.equals("Candy")){
                System.out.println("Candy.");
            }
            else {
                System.out.println("Please enter a valid snack.");
            }
        }
        else {
            System.out.println("Please enter a valid selection.");
        }


    }
}

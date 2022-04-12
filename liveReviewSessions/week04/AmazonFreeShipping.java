package week04;

import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double totalPrice = scan.nextDouble();

        if (totalPrice>=25.0){
            System.out.println("Free shipping eligible. Your order total: " + totalPrice);
        }
        else {
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING. Your order total is " + totalPrice + " It's less than minimum 25$");
        }
    }
}

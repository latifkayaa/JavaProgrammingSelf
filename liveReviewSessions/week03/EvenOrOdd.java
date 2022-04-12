package week03;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number %2==0){
            System.out.println(number +" is an even number.");
        }
        else {
            System.out.println(number + " is an odd number.");
        }
    }

}

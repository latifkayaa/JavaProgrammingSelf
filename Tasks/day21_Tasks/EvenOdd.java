package day21_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many elements you want to input:");
        int length = scan.nextInt();

        int [] list = new int[length];

        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter a number:");
            list[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(list));

        int countOdd=0, countEven=0;

        for (int i : list) {
            if(i%2==0) {
                countEven++;
            }
            else{
                countOdd++;
            }
        }

        System.out.println("countOdd = " + countOdd);
        System.out.println("countEven = " + countEven);

    }
}

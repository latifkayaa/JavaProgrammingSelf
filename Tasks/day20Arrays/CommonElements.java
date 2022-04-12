package day20Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 5 numbers for first array:");
        int [] arrayOne = new int[5];


        for (int i = 0; i < arrayOne.length; i++) {
            System.out.println("Enter a number:");
            arrayOne[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(arrayOne));

        System.out.println("Enter 5 numbers for the second array:");
        int [] arrayTwo = new int[5];

        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.println("Enter a number:");
            arrayTwo[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(arrayTwo));

        for (int i = 0; i < 5; i++) {
            int num = arrayOne[i];

            for (int j = 0; j < 5; j++) {
                int num2 = arrayTwo[j];
                if(num==num2){
                    System.out.print(num + " ");
                }
            }
        }
    }
}

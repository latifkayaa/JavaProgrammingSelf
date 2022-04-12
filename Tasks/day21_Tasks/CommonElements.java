package day21_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {

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



        System.out.println("Enter for the second array:");
        int [] list2 = new int[length];

        for (int i = 0; i < list2.length; i++) {
            System.out.println("Enter a number:");
            list2[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(list2));

        int common=0;

        for (int i : list) {
            for (int i1 : list2) {
                if(i==i1){
                    System.out.print(i + " ");
                }

            }

        }



    }
}

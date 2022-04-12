package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number you wanna input?");
        int length = scan.nextInt();
        int [] list = new int[length];



        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number:");
            list[i]=scan.nextInt();

        }

        int max=-list[0];
        int min= list[0];

        for (int i = 0; i < list.length; i++) {
            if(max<list[i]){
                max= list[i];
            }
            if(min>list[i]){
                min= list[i];
            }
        }
        System.out.println(Arrays.toString(list));
        System.out.println("min = " + min);
        System.out.println("max = " + max);



    }
}

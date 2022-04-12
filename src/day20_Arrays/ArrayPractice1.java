package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {

        // store teh elements: 10, 20, 50, 70
        int[] numbers = {10, 20, 50, 70}; //size: 4

        System.out.println(Arrays.toString(numbers));

        System.out.println("----------------------------");
        // create a variable that can contain 5 scores

        int[] scores = new int[5]; // [0, 0, 0, 0, 0]
        scores[1]= 85;
        scores[scores.length -1] = 95;
        scores[3] = 75;
        scores[0] = 65;
        scores[2] = 55;

        System.out.println( Arrays.toString(scores)); //[65, 85, 55, 75, 95]

        System.out.println("------------------------------------------");
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};  //0 ~ 11 (length -1)

        for (int i = 0; i < months.length; i++) {
            System.out.print(months[i] + " ");
        }

        System.out.println();
        for (int i = months.length-1; i>=0 ; i--) {
            System.out.print(months[i] + " ");

        }

    }
}

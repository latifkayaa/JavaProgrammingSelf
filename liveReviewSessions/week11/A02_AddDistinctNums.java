package week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A02_AddDistinctNums {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> uniqueNums = new ArrayList<>();
        System.out.println("Enter Integers(input ends with 0)");

        int value;

        do {
            value = scan.nextInt();
            if (!uniqueNums.contains(value)) {
                uniqueNums.add(value);
            }

        } while (value != 0);

        System.out.println(uniqueNums);
        System.out.println("size of uniqueNums = " + uniqueNums.size());

        //sort
        Collections.sort(uniqueNums);
        System.out.println(uniqueNums);


    }
}

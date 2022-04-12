package day20_Arrays;

import java.util.Arrays;

public class OneToHundred {
    public static void main(String[] args) {

        int [] list = new int[100];

        for (int i = 0; i <100 ; i++) {
            list[i] = i+1;
        }
        System.out.println(Arrays.toString(list));


    }
}

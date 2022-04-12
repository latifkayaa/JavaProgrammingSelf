package day20_Arrays;

import java.util.Arrays;

public class HundredToOne {
    public static void main(String[] args) {

        int [] list = new int[100];
        int num=100;

        for (int i = 0; i <100 ; i++, num--) {
            list[i] = num;
        }
        System.out.println(Arrays.toString(list));



    }
}

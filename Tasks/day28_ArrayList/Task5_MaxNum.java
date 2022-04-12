package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5_MaxNum {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,2,7,4,5));

        Integer max = list.get(0);

        for (Integer integer : list) {
            if(max<integer){
                max=integer;
            }
        }

        System.out.println("max = " + max);
    }
}

package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6_MinNum {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,2,7,4,5));

        Integer min = list.get(0);

        for (Integer integer : list) {
            if(min>integer){
                min=integer;
            }
        }

        System.out.println("min = " + min);
    }
}

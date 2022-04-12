package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2_Swap {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5)); // adding multiple elements at once by using bulk operation

        Integer temp = list.get(0);
        list.set(0, list.get(list.size()-1));
        list.set(list.size()-1, temp);
        System.out.println(list);
    }
}

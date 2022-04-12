package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1_LastElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5)); // adding multiple elements at once by using bulk operation
        list.set(list.size()-1,0);
        System.out.println("list = " + list);

    }

}

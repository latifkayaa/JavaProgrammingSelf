package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4_Combine {
    public static void main(String[] args) {

        ArrayList <String> arr1 = new ArrayList<>();
        arr1.addAll(Arrays.asList("A", "B", "C"));
        ArrayList <String> arr2 = new ArrayList<>();
        arr2.addAll(Arrays.asList("D", "E", "F", "G"));
        ArrayList <String> newArr = new ArrayList<>();

        for (String each : arr1) {
            newArr.add(each);
        }

        for (String each2 : arr2) {
            newArr.add(each2);
        }
        System.out.println("newArr = " + newArr);

    }
}

package day29_ArrayList_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> employees =new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));
        System.out.println(employees);

        employees.retainAll(Arrays.asList("Ahmet", "David"));
        System.out.println(employees + "\n-----------------------------");
        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};
        System.out.println(Arrays.toString(names));

        ArrayList<String> nameList= new ArrayList<>(Arrays.asList(names));
        nameList.removeIf(each -> each.startsWith("M"));

        names = nameList.toArray(new String[0]);
        System.out.println(Arrays.toString(names));



    }
}

package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        //Arrays.copyOf() method

        String [] students = {"Elif", "Sinem", "Gunay", "David", "Cihad", "James", "Aaron", "Daniel"};

        String [] students2= Arrays.copyOf(students, 3);
        System.out.println(Arrays.toString(students2));

        int [] numbers = {1,2,3,4,5,6,7,8};
        numbers = Arrays.copyOf(numbers,4);
        System.out.println(Arrays.toString(numbers));

        System.out.println("---------------");
        int [] scores = {10,20,30,40,50,60,70,80,90,100};
        int [] newScores= Arrays.copyOfRange(scores, 3,8 );
        System.out.println(Arrays.toString(newScores));


    }
}

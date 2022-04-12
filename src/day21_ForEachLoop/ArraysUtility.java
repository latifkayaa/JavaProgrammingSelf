package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {


        int [] nums = {1,2,3,4,5};

   /*     System.out.println(nums); //gonna give hashcode!

        String str = "Java";
        System.out.println("str = " + str.toString());  // toString method is how JVM behaves but in String case,
                                                        // it is done implicitly. For every objects!

        System.out.println();
 */
        System.out.println(Arrays.toString(nums)); // "{1,2,3,4,5}"
        //toString converst the array object to string, returns string (one dimensional)


        System.out.println(nums[0]); // it's not an string, an element, integer element..

        int [] scores = {95,100,55,70,85};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        String[] names = {"Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinema"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String[] names2 = {"gunay", "Anna", "Zuhal", "ahmet", "maria", "Sinema"};
        Arrays.sort(names2);
        System.out.println(Arrays.toString(names2));

        Arrays.equals(names,names2);
        System.out.println( Arrays.equals(names,names2));

        System.out.println("----------------------------");

        char [] ch1= {'a', 'b', 'c'};
        char [] ch2= {'c', 'a', 'b'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean check = Arrays.equals(ch1,ch2);
        System.out.println("check = " + check);
    }
}

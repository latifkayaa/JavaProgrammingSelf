package day29_ArrayList_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {

        String [] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada" };

        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        /*for (String each : countries) {
            if(each.length()<10){
                country.add(each);
            }
        }
        */

        list.removeIf(each -> each.length()>=10);
        countries = list.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));




    }
}

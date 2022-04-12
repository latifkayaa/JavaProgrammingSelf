package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class CopyCertainValues {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] arr = {scan.next(),scan.next(),scan.next(),scan.next(),scan.next()};
        System.out.println(Arrays.toString(getWithE(arr)));

    }


    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------
        int count = 0;
        for (String s : arr) {
            if(s.contains("e")){
                count++;
            }
        }

        String[] fewValues= new String[count];

        for (int i = 0; i < fewValues.length; i++) {

            for (String s : arr) {
                if(s.contains("e")){
                    fewValues[i] = s;
                    i++;
                }
            }
        }


        //YOUR CODE ENDS HERE -----------------------

        return fewValues;
    }



}

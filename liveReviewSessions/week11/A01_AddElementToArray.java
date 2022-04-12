package week11;

import java.util.Arrays;

public class A01_AddElementToArray {
    public static void main(String[] args) {
        //create a method that adds new element to an Array.
        //Method will accept a String Array and a String variable
        //return a new array

        String [] list = {"A", "B", "C"};
        list= addElement(list, "D");
        list= addElement(list, "E");
        list= addElement(list, "F");

        System.out.println(Arrays.toString(list));

    }

    public static String [] addElement(String [] words, String word){

        String [] newArr = new String[words.length+1];

        for (int i = 0; i < words.length ; i++) {
            newArr[i]= words[i];
        }
        newArr[newArr.length-1]=word;
        return newArr;

    }

}

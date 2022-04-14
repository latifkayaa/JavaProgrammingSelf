package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.pi;
//import static day34_GarbageCollection_AccessModifiers.Circle.*; IMPORTS ALL THE STATIC MEMBERS OF THE CLASS!

import static utilities.MathUtility.max;

public class StaticImport {

    public static void main(String[] args) {

        System.out.println(Circle.pi); // Class name is unnecessary!
        System.out.println(pi);

        System.out.println(max(10,20));

    }




}
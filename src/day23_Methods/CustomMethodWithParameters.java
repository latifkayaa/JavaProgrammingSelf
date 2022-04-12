package day23_Methods;

import java.util.Scanner;

public class CustomMethodWithParameters {
    public static void main(String[] args) {
        evenOdd(13);
        findAge(1994);
        findNumbersBetween(15,23);
    }

    public static void evenOdd(int num){
        if(num%2==0){
            System.out.println("Even number.");
        }
        else{
            System.out.println("Odd number.");
        }

    }

    public static void findAge (int birthYear){
        int age= 2022-birthYear;
        System.out.println("Age is: "+ age);
    }

    public static void findNumbersBetween (int firstNum, int lastNum){
        for (int i = firstNum; i <=lastNum ; i++) {
            System.out.print(i+ " ");
        }
    }
}

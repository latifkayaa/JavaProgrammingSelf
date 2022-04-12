package day23_Methods;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        greeting();
        System.out.println(input());
    }
    public static void greeting(){
        System.out.println("Hello Hello");
    }
    public static String input(){
        Scanner scan = new Scanner(System.in);
        String a= scan.next();
        return a;
    }

}

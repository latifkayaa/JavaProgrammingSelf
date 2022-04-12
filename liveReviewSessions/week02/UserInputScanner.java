package week02;

import java.util.Scanner;

public class UserInputScanner {
    public static void main(String[] args) {

        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put your name: ");

        name = scanner.next();
        System.out.println(name);
    }
}

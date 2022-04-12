package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age.");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter name.");
        String name = scan.nextLine();
        System.out.println("Enter gpa.");
        double gpa = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter your school name.");
        String school = scan.nextLine();
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("school = " + school);
        System.out.println("gpa = " + gpa);
        scan.close();
    }
}

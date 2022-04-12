package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age.");
        int age = scan.nextInt();  //1-120


        while(!(age<=120 && age>=1)){
            System.out.println("Invalid age. Please enter your age.");
            age = scan.nextInt();
        }

        System.out.println("Are you a US citizen? Yes/No");
        String citizen = scan.next();

        while (!(citizen.equalsIgnoreCase("yes") || citizen.equalsIgnoreCase("no"))){
            System.out.println("Invalid answer. Only yes or no:");
            citizen = scan.next();
        }


        if(age>=18 && citizen.equalsIgnoreCase("yes")){
            System.out.println("Can vote.");
        }else{
            System.out.println("Can't vote.");
        }


    }
}

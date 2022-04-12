package stringTasks;

import java.util.Scanner;

public class _9ReverseAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        String reverse = "";

        if (word.length()<5){
            System.out.println("Too short!");
        }else if (word.length()>5){
            System.out.println("Too long!");
        }else
            reverse = word.charAt(4) + "" +  word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);

        System.out.println(reverse);
        scan.close();
    }
}
/*Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.
	cydeo
	oedyc
*/
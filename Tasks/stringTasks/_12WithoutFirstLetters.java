package stringTasks;

import java.util.Scanner;

public class _12WithoutFirstLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first word:");
        String str = scan.next();
        System.out.println("Enter the second word.");
        String str2 = scan.next();

        String both= str.substring(1) + str2.substring(1);
        System.out.println("both = " + both);
        scan.close();
    }
}

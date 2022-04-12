package day21_ForEachLoop;

import java.util.Scanner;

public class UniqueElements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many names you're gonna input:");
        int length = scan.nextInt();

        String[] names = new String[length];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter the " + i + ". index's name:");
            names[i] = scan.next();
        }

        String uniqNames = "";

        for (String name : names) {
            int count = 0;

            for (String each : names) {
                if (each.equals(name)) {
                    count++;
                }
            }

            if (count > 1) {
                continue;
            }
            uniqNames += name + ", ";
        }

        System.out.println("uniqNames = " + uniqNames);
    }
}

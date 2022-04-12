package day20_Arrays;

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


        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            int count = 0;

            for (int i1 = 0; i1 < names.length; i1++) {
                String each= names[i1];

                if (each.equals(name)) {
                    count++;
                }

            }


            if (count >1) {
                continue;
            }
            uniqNames += name + ", ";

        }


        System.out.println("uniqNames = " + uniqNames);


    }
}

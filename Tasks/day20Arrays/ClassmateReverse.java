package day20Arrays;

import java.util.Scanner;

public class ClassmateReverse {
    public static void main(String[] args) {
        // Ahmet
        // temha
        // 4, 3-4, 2-3, 1-2, 0-1
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 of your classmates names:");

        String[] names = new String[10];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter the name:");
            names[i] = scan.next();
        }


        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            String reversed = "";

            for (int j = name.length()-1; j >=0; j--) {
                reversed += name.charAt(j);
            }

            System.out.println("reversed = " + reversed);


        }

    }
}

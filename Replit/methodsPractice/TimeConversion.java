package methodsPractice;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */

        if (s.contains("AM") || s.equals("12:00:00PM ")) {
            if (s.equals("12:00:00AM")) {
                System.out.println("00:00:00");
            } else {
                System.out.println(s.substring(0, s.trim().length() - 2));
            }
        } else {
            s = s.replace(s.substring(0, 2), Integer.valueOf(s.substring(0, 2)) + 12 + "");
            System.out.println(s.substring(0, s.length() - 2));
        }
    }
}

package Others;

import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int length = str.length();
        int count =0;

        for (int i = 0; i < length-3; i++) {
            if (str.substring(i,i+4).equals("java")){
                count++;
            }

        }
        System.out.println(count);
    }
}

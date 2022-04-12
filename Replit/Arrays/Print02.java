package Arrays;

import java.util.Scanner;

public class Print02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= input.next();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+ ", "+ arr[i+1] );
            i++;
        }

    }
}

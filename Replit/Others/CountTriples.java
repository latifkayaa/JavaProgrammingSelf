package Others;

import java.util.Scanner;

public class CountTriples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE
        int length= str.length();

        for (int i = 0; i < length-2; i++) {
            if(str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2)){
                count++;
            }

        }
        System.out.println(count);


    }
}

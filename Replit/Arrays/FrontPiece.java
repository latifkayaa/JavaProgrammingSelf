package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];

        int [] front = new int[2];

        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }

        if(size <2){
            System.out.println(Arrays.toString(num));
        }
        else {
            int j=0;
            while (j<=1){
                front[j] = num[j];
                j++;
            }
            System.out.println(Arrays.toString(front));

        }



    }
}

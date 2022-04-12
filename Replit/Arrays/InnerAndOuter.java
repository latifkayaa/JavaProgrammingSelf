package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class InnerAndOuter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();
        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];
        for (int i = 0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        for (int j = 0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);
        //WRITE YOUR CODE HERE

        boolean flag = false;
        int count = 0;

        for (int i = 0; i < inner.length; i++) {
            int num = inner[i];
            for (int each : outer) {
                if (num == each) {
                    count++;
                }
            }
            if (count >= inner.length) {
                flag = true;
            }

        }
        System.out.println(flag);

    }
}

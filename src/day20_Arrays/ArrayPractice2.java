package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char[] letter = new char[26];

      /*  for (char i = 'A', j = 0; i <= 'Z' && j < letter.length; i++, j++) {
            letter [j]=i;
        }
        System.out.println(Arrays.toString(letter));
*/

        char ch = 'A';
        for (int i = 0; i < letter.length; i++, ch++) {
            letter[i] = ch;
        }
        System.out.println(Arrays.toString(letter));  //[A~Z]

    }
}

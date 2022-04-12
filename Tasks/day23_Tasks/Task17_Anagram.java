package day23_Tasks;

import java.util.Arrays;

public class Task17_Anagram {
    public static void main(String[] args) {

        anagram("latif", "fital");

    }
    public static void anagram(String str1, String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1, ch2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not anagram");
        }

    }
}

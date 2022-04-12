package Arrays;

import java.util.Scanner;

public class Shortest1 {
    public static void main(String[] args) {
//Her elementin uzunluğunu bul ve uzunlukları kıyasla, en güçüğünü not al, ardından yeni bir loop o uzunlukta olanı yazdır.

        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                        scan.next(), scan.next(), scan.next()};


        int minLength = str[0].length();
        for (String s : str) {
            if(minLength>s.length()){
                minLength= s.length();
            }
        }

        for (String s : str) {
            if(s.length() == minLength){
                System.out.println(s.substring(0,s.length()-1));
            }
        }


    }
}

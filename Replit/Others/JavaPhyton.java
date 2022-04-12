package Others;

import java.util.Scanner;

public class JavaPhyton {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int length= sentence.length();
        int countOfJava=0; int countOfPhyton=0;

        for (int i = 0; i < length-5 ; i++) {
            if (sentence.substring(i,i+6).equals("python")){
                countOfPhyton++;
            }
        }

        for (int i = 0; i < length-3; i++) {
            if (sentence.substring(i,i+4).equals("java")){
                countOfJava++;
            }
        }
        if (countOfJava == countOfPhyton) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}

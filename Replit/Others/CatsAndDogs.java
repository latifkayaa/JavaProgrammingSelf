package Others;

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        int length = word.length();

        for (int i = 0; i<length-2; i++){
            if(word.substring(i,i+3).equals("cat")){
                countOfCats++;
            }
            else if (word.substring(i,i+3).equals("dog")){
                countOfDogs++;
            }
        }

        if (countOfDogs == countOfCats){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }


}

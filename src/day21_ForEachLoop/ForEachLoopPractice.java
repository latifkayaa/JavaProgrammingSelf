package day21_ForEachLoop;

import org.w3c.dom.ls.LSOutput;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        String [] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        String firstLast= "";

        for (String word : words) {
            firstLast = word.charAt(0) + "" +word.charAt(word.length()-1);
            System.out.print(firstLast + "\t");
        }





    }
}

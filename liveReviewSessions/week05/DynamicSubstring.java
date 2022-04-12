package week05;

public class DynamicSubstring {
    public static void main(String[] args) {

        String search= "search result is: 123543";
        int x = search.indexOf("1");
        String result= search.substring(x);
        System.out.println("result = " + result);

        String today = " I coded a lot of [java] today.";

       String word = today.substring(today.indexOf("[")+1, today.indexOf("]"));
        System.out.println("word = " + word);


    }
}

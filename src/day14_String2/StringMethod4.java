package day14_String2;

public class StringMethod4 {
    public static void main(String[] args) {
        //.substring() method

        String word = "Cydeo School";

        String subWord = word.substring(0,5);
        System.out.println("subWord = " + subWord);

        String subWord2 = word.substring(6,12);
        System.out.println("subWord2 = " + subWord2);

        String word2= "Java Programming Language";
        String s1;
        String s2;
        String s3;

        int firstWord= word2.indexOf("a ");
        s1= word2.substring(0,firstWord+1);

        int secondWord1 = word2.indexOf("P");
        int secondWord2= word2.indexOf("g ");
        s2= word2.substring(secondWord1, secondWord2+1);

        int thirdWord1 = word2.indexOf("L");
        s3= word2.substring(thirdWord1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

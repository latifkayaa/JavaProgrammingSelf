package day13_String;

public class StringMethods {
    public static void main(String[] args) {
        String word = "Cydeo";
        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

        /*char tenthChar= word.charAt(9);
        System.out.println("tenthChar = " + tenthChar); */

        String name = "Latif Kaya";
        int lengthOfName= name.length();
        System.out.println("lengthOfName = " + lengthOfName);

        char lastChar= name.charAt(lengthOfName-1);
        System.out.println("lastChar = " + lastChar);

        String str = "wooden spoon";
        String newStr= str.toUpperCase();
        System.out.println("newStr = " + newStr);
        System.out.println("str = " + str);
        str= str.toUpperCase();
        System.out.println("str = " + str);





    }
}

package day14_String2;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1= "        EU BATCH 8        ";
        System.out.println("str1 = " + str1);
        str1= str1.trim();
        System.out.println("str1 = " + str1);

        String str2= "Latif KAYA";
        int fourthChar = str2.indexOf("t");
        System.out.println("fourthChar = " + fourthChar);

        int aChar= str2.indexOf("A");
        System.out.println("aChar = " + aChar);

        int aChar2= str2.lastIndexOf("A");
        System.out.println("aChar2 = " + aChar2);

        int tChar= str2.lastIndexOf("t");
        System.out.println("tChar = " + tChar);

        int twoChar= str2.indexOf("AY");
        System.out.println("twoChar = " + twoChar);

        String str3= "Java Programming language";
        int thirdA= str3.indexOf("am");
        System.out.println("thirdA = " + thirdA);

    }
}

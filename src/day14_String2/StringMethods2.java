package day14_String2;

public class StringMethods2 {
    public static void main(String[] args) {

        String s= "Java Nova Cava Wawa orange";

        int firstA= s.indexOf("a");
        System.out.println("firstA = " + firstA);

        int lastA= s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);

        int justChar= s.indexOf("a N");
        System.out.println("justChar = " + justChar);

        //int fourthA= s.lastIndexOf("av");
        int fourthA= s.indexOf("Ca")+1;
        System.out.println("fourthA = " + fourthA);

        int fifthA= s.lastIndexOf("va")+1;
        System.out.println("fifthA = " + fifthA);

    }
}

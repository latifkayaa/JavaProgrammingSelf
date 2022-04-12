package week05;

public class StringReview02 {
    public static void main(String[] args) {

        String message = "EU8 is awesome!";
        int length = message.length();
        System.out.println("length = " + length);

        String str = "    abc   ";
        System.out.println(str.trim());
        str = "   ab   c   ";
        System.out.println(str.replaceAll("   ", ""));

        String str4 = str.trim().replace("   ", "").toUpperCase();
        System.out.println("str4 = " + str4);
    }
}

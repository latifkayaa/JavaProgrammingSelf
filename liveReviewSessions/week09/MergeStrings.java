package week09;

public class MergeStrings {
    public static void main(String[] args) {
        String merge = merge("Ali", "Ahmet");
        System.out.println("merge = " + merge);
    }

    public static String merge(String str1, String str2) {
        String result = "";
        int min = Math.min(str1.length(), str2.length());

        for (int i = 0; i < min; i++) {
            result += str1.charAt(i) +""+ str2.charAt(i);
        }

        if (str1.length()>str2.length()) {
            return result+str1.substring(str2.length());
        }

            return result+str2.substring(str1.length());


    }

}

package day24_Method_Return;

public class ReturnMethodPractice4 {
    public static void main(String[] args) {
        String uniqueChars= uniqueChar("abcghhy");
        System.out.println("uniqueChars = " + uniqueChars);
    }

    public static String uniqueChar(String str){
        String result ="";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if(ch!=each){
                    result+=str.charAt(i);
                }
            }
        }
        return result;
    }
}

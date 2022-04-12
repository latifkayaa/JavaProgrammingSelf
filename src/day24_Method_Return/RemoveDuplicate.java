package day24_Method_Return;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String check = remove("aaabbcgtt");
        System.out.println("check = " + check);

    }

    public static String remove(String str) {
        String result = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(!(result.contains(ch+""))){
                result+=ch;
            }
        }
        return result;
    }
}

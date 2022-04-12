package day24_Tasks;

public class Task3_Reverse {
    public static void main(String[] args) {
/*3. create a method named reverse that passes one string parameter, the method can return the reversed string
Ex:str = "Java";
reverse(str) ==> avaJ */
        String str1= "Java";

        String reverse = reversed(str1);
        System.out.println("reverse = " + reverse);

    }

    public static String reversed (String word){
        String result = "";

        for (int i = word.length()-1; i>=0; i--) {
            result +=word.charAt(i);
        }
        return result;
    }




}

package day24_Tasks;

public class Task4_Palindrome {
    public static void main(String[] args) {
/*4. By using the reverse method above to create another method named isPalindrome
that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false
Ex:str = "Level"
isPalindrome(str) ===> true */

        String str1 = "levelt";
        boolean check = isPalindrome(str1);
        System.out.println("check = " + check);

    }

    public static boolean isPalindrome (String word1){

        String result = Task3_Reverse.reversed(word1);

        /*for (int i = word1.length()-1; i>=0 ; i--) {
            result += word1.charAt(i);
        } */



        if(word1.equals(result)){
            return true;
        }
        return false;

    }


}

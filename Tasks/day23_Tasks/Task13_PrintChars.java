package day23_Tasks;

public class Task13_PrintChars {
    public static void main(String[] args) {
        //create a method named printEachChar that can print each characters of a string
        printEachChar("Latif KAYA");
    }

    public static void printEachChar(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+ " ");
        }
    }

}

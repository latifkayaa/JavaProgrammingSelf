package day27_Wrapper;

public class CharacterWrapperMethods {
    public static void main(String[] args) {

        char ch1= 'A';
        boolean check= Character.isDigit(ch1);
        System.out.println("check = " + check);

        boolean check2= Character.isLetter(ch1);
        System.out.println("check2 = " + check2);


    }
}

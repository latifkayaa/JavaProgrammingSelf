package day09_IfElseStatements;

public class MinNumber {
    public static void main(String[] args) {
        int number1 = 2500;
        int number2 = 200;

        boolean bigger = number1<number2;
        boolean equal = number1==number2;

        if(equal){
            System.out.println("Numbers are equal.");
        }

        if (bigger){
            System.out.println("Bigger number is= " + number2);
        }

        if(!bigger){
            System.out.println("Bigger number is= "+ number1);
        }

    }
}

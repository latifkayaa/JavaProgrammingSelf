package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {


        System.out.println(1<5);

        int a= 100;
        int b= 100;
        System.out.println("b = " + ++b);
        System.out.println("a = " + a++);
        System.out.println("a = " + a);

        int num1=200;
        int num2=100;
        System.out.println("num2 = " + num2--);
        System.out.println("num1 = " + --num1);
        System.out.println("num2 = " + num2);
    }
}

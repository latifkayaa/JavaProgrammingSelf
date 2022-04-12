package day08_IfStatements;

public class SwapTwoVariables_WithTemporaryVariable {
    public static void main(String[] args) {

        int a= 10;
        int b=15;

         int c=a;
         a=b;

         b=c;
        System.out.println("c = " + c);
        System.out.println("b = " + b);
        System.out.println("a = " + a);

    }
}

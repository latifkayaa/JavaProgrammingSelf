package week09;

public class Calculator {
    public static void main(String[] args) {
        double number1 = 20.6, number2 = 10.7;
        double added = add(number1, number2);
        double subst = substract(number1, number2);
        double div = divide(number1, number2);
        double mult = multiply(number1, number2);
        System.out.println("mult = " + mult);
        System.out.println("div = " + div);
        System.out.println("subst = " + subst);
        System.out.println("added = " + added);

    }

    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;

    }

    public static double substract(double num1, double num2) {
        double remain = Math.abs(num1 - num2);
        return remain;
    }

    public static double multiply(double num1, double num2) {
        double multi = num1 * num2;
        return multi;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
}

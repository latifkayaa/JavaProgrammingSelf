package day23_Tasks;

public class Task15_Calculator {
    public static void main(String[] args) {

calculator(10,15,"y");
    }

    public static void calculator (int num1, int num2, String mathOperator){
        int result =0;
        switch (mathOperator){
            case "+":
                result = num1+num2;
                break;
            case "-":
                result = Math.abs(num1-num2);
                break;
            case "*":
                result = num1*num2;
                break;
            case "/":
                result= num1/num2;
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }
        System.out.println("result = " + result);
    }
}

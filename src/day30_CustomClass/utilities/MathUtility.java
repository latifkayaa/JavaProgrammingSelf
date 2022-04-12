package day30_CustomClass.utilities;

public class MathUtility {

    public static int sum (int num1, int num2){
        int sum= num1+num2;
        return sum;
    }

    public static double sum (double num1, double num2){
        double sum= num1+num2;
        return sum;
    }

    public static int subtract (int num1, int num2){
        int subst= num1-num2;
        return subst;
    }

    public static double subtract (double num1, double num2){
        double subst= num1-num2;
        return subst;
    }

    public static int multiplication (int num1, int num2){
        int multiply= num1*num2;
        return multiply;
    }

    public static double multiplication (double num1, double num2){
        double multiply= num1*num2;
        return multiply;
    }

    public static double division (double num1, double num2){
        double div= num1*num2;
        return div;
    }

    public static boolean isOdd(int num){
        boolean check= ((num&2)!=0)? true: false;
        return check;
    }

    public static boolean isEven(int num){
        boolean check = ((num&2)==0)? true: false;
        return check;
    }

    public static int max(int num1, int num2){
        if(num1<num2){
            return num2;
        }
        return num1;
    }

    public static double max(double num1, double num2){
        if(num1<num2){
            return num2;
        }
        return num1;
    }

    public static int min(int num1, int num2){
        if(num1<num2){
            return num1;
        }
        return num2;
    }

    public static double min(double num1, double num2){
        if(num1<num2){
            return num1;
        }
        return num2;
    }

    public static int square(int num){
        return (num*num);
    }

    public static double square(double num){
        return num * num;
    }

    public static int cube(int num){
        return num * num * num;
    }

    public static double cube(double num){
        return num * num * num;
    }



    }

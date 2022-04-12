package day27_Wrapper;

public class WrapperClassesIntro {
    public static void main(String[] args) {

        int num1=100;

        Integer n1= num1; //Autoboxing- primitive to object - implicitly

        int num2= n1; //unboxing object to primitive - implicitly

        Integer integerValue = 100;

        long longValue= integerValue;

        System.out.println("-------------");

        int num3=200;
        // Long l2= num3; primitive only can be changed to only its Wrapper Classes
        //However unboxing can be done if it's in range.

        Byte b1=25;
        byte a1 = b1; //unboxing
        short s1= b1; //unboxing can be done if it's within range!
        int i1= b1; //possible because it's within range..

        Integer z=900;
        Integer y= z;

        int [] number1= {1,2,3,4,5};
        int [] number2 = {z,y};
        Integer [] number3 = {1,2,3,4,5};



    }
}

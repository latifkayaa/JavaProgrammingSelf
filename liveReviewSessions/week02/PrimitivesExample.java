package week02;

public class PrimitivesExample {

    public static void main(String[] args) {

        //INTEGERS!
        byte num1; // Declaring a variable
        num1 = 123; //initializing a variable / assigning a value

        short num2= 10340; //Declaring and initializing at the same line!

        int distance= 3_000_000_00;
        long distanceMore = 234324234324L; //we have to put an L at the end! If it passes the int limit. 2 billion ....


        float rate = 100.7f;
        double dNum= 123.6;

        System.out.println("Before Swapping values");

        System.out.println("dNum = " + dNum);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num2 = num1;
        System.out.println("num2 = " + num2);
        num2= (short) distance;
        System.out.println("num2 = " + num2);
    }

}

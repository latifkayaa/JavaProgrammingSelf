package day08_IfStatements;

public class EvenlyDivisible {
    public static void main(String[] args) {

        int number = 65;
        boolean evenNum= number%2==0;
        boolean thirdNum= number%3==0;
        boolean fifthNum= number%5==0;
        boolean both3And5= number%3==0 && number%5==0;
        System.out.println("fifthNum = " + fifthNum);
        System.out.println("thirdNum = " + thirdNum);
        System.out.println("evenNum = " + evenNum);
        System.out.println("both3And5 = " + both3And5);



    }
}

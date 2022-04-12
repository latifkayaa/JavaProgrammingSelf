package week09;

public class CustomMethodsPractice {
    public static void main(String[] args) {

        isEligible(10);
        isEligible(21);

    }
    public static void isEligible(int age){

        if(age>=21){
            System.out.println("Eligible to buy alcohol.");
        }
        else{
            System.out.println("Not eligible.");
        }
    }

}

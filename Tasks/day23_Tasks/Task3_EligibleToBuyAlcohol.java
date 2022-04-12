package day23_Tasks;

public class Task3_EligibleToBuyAlcohol {
    public static void main(String[] args) {
//3. create a method that can check if a person is eligible to buy alcohol

        eligibleAlcohol(1);
    }

    public static void eligibleAlcohol (int number){
        if(number<18){
            System.out.println("Not eligible.");
        }else{
            System.out.println("Eligible to buy alcohol.");
        }
    }
}

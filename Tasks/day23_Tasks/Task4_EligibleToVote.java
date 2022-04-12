package day23_Tasks;

public class Task4_EligibleToVote {
    public static void main(String[] args) {
        eligibleToVote(18, "turkey");
    }

    public static void eligibleToVote(int age, String nationality) {
        if (age >= 18 && nationality.equalsIgnoreCase("USA")) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }

    }
}

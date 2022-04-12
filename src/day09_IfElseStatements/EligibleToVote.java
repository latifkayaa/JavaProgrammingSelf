package day09_IfElseStatements;

public class EligibleToVote {
    public static void main(String[] args) {
        boolean citizenship= true;
        int age = 17;

        if (age>=18 && citizenship){
            System.out.println("Eligible to vote.");
        }
        else {
            System.out.println("Is not eligible to vote.");
        }
    }
}

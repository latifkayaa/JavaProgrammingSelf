package stringTasks;

import java.util.Scanner;

public class _10TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Is the check gonna be splitted? Enter true or false.");
        boolean split = scan.nextBoolean();
        System.out.println("How many people were there at the party?");
        int numberOfPeople = scan.nextInt();
        System.out.println("Enter the check amount: ");
        double checkAmount = scan.nextDouble();
        System.out.println("How was the service quality?");
        String quality = scan.next();
        double tip = 0;

        if (quality.equals("Excellent")) {
            tip = checkAmount / 4;
        } else if (quality.equals("Great")) {
            tip = checkAmount / 5;

        } else if (quality.equals("Good")) {
            tip = checkAmount / 100 * 15;
        } else if (quality.equals("Fair")) {
            tip = checkAmount / 10;

        } else if (quality.equals("Poor")) {
            tip = checkAmount / 20;

        } else {
            System.out.println("Please enter a valid choice.");
        }

        double wholeCheckWithTip= checkAmount+tip;

        double tipPerPerson= 0;
        double checkPerPerson=0;

        if (split==true){
           tipPerPerson= tip/numberOfPeople;
           checkPerPerson= wholeCheckWithTip/numberOfPeople;
        }

        System.out.println("Number of people entered: " + numberOfPeople);
        System.out.println("Total to pay:" + wholeCheckWithTip);
        System.out.println("Total tip:" + tip);
        System.out.println("Total per person:" + checkPerPerson);
        System.out.println("Tip per person: "+ tipPerPerson);


        scan.close();
}
}

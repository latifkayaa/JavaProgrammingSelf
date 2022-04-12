package stringTasks;

import java.util.Scanner;

public class _19TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean split;
        double tip=0;
        double checkAmount, totalPay, totalTip, totalPerPerson;
        double tipPerPerson=0;
        int numberOfPeople;
        String serviceQuality;

        split= scan.nextBoolean();
        numberOfPeople = scan.nextInt();
        checkAmount = scan.nextDouble();
        serviceQuality = scan.next();

        switch(serviceQuality){
            case "Excellent":
                tip= checkAmount/4;
                break;
            case "Great":
                tip= checkAmount/5;
                break;
            case "Good":
                tip= checkAmount/100*15;
                break;
            case "Fair":
                tip= checkAmount/10;
                break;
            case "Poor":
                tip= checkAmount/20;
                break;
        }

        if(split){
            tipPerPerson= tip/numberOfPeople;
        }
        totalPay= checkAmount + tip;
        totalPerPerson= checkAmount/numberOfPeople;


        System.out.println("Number of people entered: " + numberOfPeople);
        System.out.println("Total to pay: " + totalPay);
        System.out.println("Total tip: " + tip);
        System.out.println("Total per person: " + totalPerPerson);
        System.out.println("Tip to pay: " + tipPerPerson);


    }
}

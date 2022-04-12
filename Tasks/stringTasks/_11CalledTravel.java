package stringTasks;

import java.util.Scanner;

public class _11CalledTravel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have a valid passport? Yes or No.");
        String passport = scan.nextLine();


        if (passport.equals("Yes")) {
            int ticket = 1000;
            System.out.println("Which country are you traveling to?");
            String country = scan.nextLine();

            System.out.println("How many bags will you take with yourself?");
            byte bag = scan.nextByte();

            System.out.println("How many people you're traveling with?");
            short numberOfPeople = scan.nextShort();

            scan.nextLine();

            System.out.println("Enter name of the people you're traveling with:");
            String names = scan.nextLine();

            int totalTicket = 0;
            if (numberOfPeople <= 3) {
                totalTicket = ticket + (bag * 50) + numberOfPeople * 100;
            } else {
                totalTicket = ticket + (bag * 50) + 300;
            }

            System.out.println("Your ticket is booked to " + country + ". We have charged extra $" + (bag * 50) + " for the " + bag + "  bags but " +
                    "you are traveling with " + names + ", so we are giving you a discount. Your total cost is $" + totalTicket);
        } else if (passport.equals("No")) {
            int baseRenewal = 200;
            System.out.println("When did your passport expired?");
            int year = scan.nextInt();
            scan.nextLine();
            int Renewal = baseRenewal + (2022 - year) * 75;
            System.out.println("Which country you're planning to travel?");
            String country2 = scan.nextLine();
            System.out.println("Will you travel next year too? Yes or No.");
            String answer = scan.nextLine();
            if (answer.equals("Yes")) {
                Renewal += 100;
            } else {
                Renewal -= 50;
            }

            System.out.println("Looks like your password has been expired for " + (2022 - year) +
                    " years but not to worry we will get it ready for you to travel to " + country2 + ". Your total cost has come out to $" + Renewal);

        } else {
            System.out.println("Please enter only Yes or No.");
        }


        scan.close();

    }
}

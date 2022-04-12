package day12_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        /*Write a program for the speed check. a variable named speedLimit is given and assigned,
        ask user to enter the current speed, if the current speed is over the speedLimit print slow down,
        otherwise do not print anything
Ex:
speedLimit = 55;  Enter current speed: 105 output: You're driving 50 mph over the limit. Slow down! */
        Scanner scan = new Scanner(System.in);

        int speedLimit = 40;
        int currentSpeed= scan.nextInt();
        int diff= currentSpeed-speedLimit;

        if (currentSpeed>speedLimit){
            System.out.println("You're driving " + diff + " mph over the limit. Slow down.");
        }
        scan.close();

    }
}

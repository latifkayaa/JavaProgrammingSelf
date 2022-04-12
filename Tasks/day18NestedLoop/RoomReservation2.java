package day18NestedLoop;

import java.util.Scanner;

public class RoomReservation2 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int total = 0;

       while(true){
           System.out.println("Which room you want to reserve? \nKing bed - Queen Bed - Single Bed");
           String type = scan.nextLine().toLowerCase();

           while(!(type.equals("king bed") || type.equals("queen bed") || type.equals("single bed"))){
               System.out.println("Please enter a valid room type.");
               type = scan.nextLine();
           }

           total += (type.equals("king bed")) ? 120 : (type.equals("queen bed")) ? 100 : 80;

           System.out.println("Would you like to select another room?");
           String a = scan.nextLine().toLowerCase();

           while( !( a.equals("yes") || a.equals("no") ) ){ // while the answer is not valid answer
               System.out.println("Invalid Entry, please re-enter");
               System.out.println("Would you like to select another room?");
               a = scan.nextLine().toLowerCase();
           }

           if(a.equals("no")){
               System.out.println("Your total price is: $"+total);
               break;
           }
       }





    }
}

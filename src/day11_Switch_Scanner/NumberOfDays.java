package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int year = 2022;
        int month = 5;
        String result = "";


        if (month >= 1 && month <= 12) {

            switch (month) {

                case 2:
                    result =(year % 4 == 0) ? "29 days." : "28 days.";
                    break;
                case 1:  case 3: case 5:  case 7:
                case 8:  case 10: case 12:
                    result = "31 days.";
                    break;
                case 4: case 6: case 9: case 11:
                    result = "30 days.";
                    break;
            }


        } else {
            result = "Invalid number.";
        }
        System.out.println("result = " + result);


    }
}

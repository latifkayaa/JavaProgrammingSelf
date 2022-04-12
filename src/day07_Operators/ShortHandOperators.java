package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

    //assignment: =

        int number= 100;
        number = 299;
        System.out.println(number);
        number = 123213;
        System.out.println("number = " + number);

        double balance = 1234.90;
        balance+= 126.10;
        System.out.println("balance = " + balance);
        double withdrawal = balance;
        withdrawal-=1000;
        System.out.println("withdrawal = " + withdrawal);

        double salary=5000.5;
        salary*=12;
        System.out.println("salary = " + salary);

        double doge= 0.0000001;
        doge *= 1000000;
        System.out.println("doge = " + doge);



    }

}

package logic01;

public class blueTicket {
    public static void main(String[] args) {

    }

    public int blueTicket(int a, int b, int c) {

        int sum1 = a + b;
        int sum2 = a + c;
        int sum3 = b + c;
        if (sum1 == 10 || sum2 == 10 || sum3 == 10) {
            return 10;
        } else if (sum1 == 10 + sum2 || sum1 == 10 + sum3) {
            return 5;
        } else {
            return 0;
        }

    }

}

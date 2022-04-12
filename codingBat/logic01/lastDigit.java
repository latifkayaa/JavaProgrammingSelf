package logic01;

public class lastDigit {
    public static void main(String[] args) {

    }

    public static boolean lastDigit(int a, int b, int c) {

        int count = 0;
        if (a % 10 == b % 10 || b % 10 == c % 10 || c % 10 == a % 10)
            count++;

        if (count >= 1)
            return true;
        else return false;
    }
}

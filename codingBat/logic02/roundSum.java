package logic02;

public class roundSum {
    public static void main(String[] args) {

    }

    public int roundSum(int a, int b, int c) {

        int roundA = (a % 10);
        int roundB = (b % 10);
        int roundC = (c % 10);

        if (roundA < 5) {
            a -= roundA;
        }
        if (roundB < 5) {
            b -= roundB;
        }
        if (roundC < 5) {
            c -= roundC;
        }
        if (roundA >= 5) {
            a += (10-roundA);
        }
        if (roundB >= 5) {
            b += (10-roundB);
        }
        if (roundC >= 5) {
            c+= (10-roundC);
        }

        return a+b+c;

    }


}


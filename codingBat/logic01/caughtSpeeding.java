package logic01;

public class caughtSpeeding {
    public static void main(String[] args) {
/*You are driving a little too fast, and a police officer stops you.
Write code to compute the result, encoded as an int value:
0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2.
Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
 */
        System.out.println(caughtSpeeding(76, true));
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            if (speed >= 86) {
                return 2;
            } else if (speed <= 85 && speed >= 66) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (speed >= 81) {
                return 2;
            } else if (speed <= 80 && speed >= 61) {
                return 1;
            } else {
                return 0;
            }
        }

    }

}

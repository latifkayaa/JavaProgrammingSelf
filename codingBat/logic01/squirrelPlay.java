package logic01;

public class squirrelPlay {
    public static void main(String[] args) {
/*The squirrels in Palo Alto spend most of the day playing.
In particular, they play if the temperature is between 60 and 90 (inclusive).
Unless it is summer, then the upper limit is 100 instead of 90.
Given an int temperature and a boolean isSummer,
return true if the squirrels play and false otherwise.
 */

        System.out.println(squirrelPlay(0, true));
    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {

        if (isSummer && (temp <= 100 && temp >= 60)) {
            return true;
        } else if (!isSummer && ((temp <= 90 && temp >= 60))) {
            return true;
        } else {
            return false;
        }

    }


}

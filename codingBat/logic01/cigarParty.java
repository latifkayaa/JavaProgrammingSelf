package logic01;

public class cigarParty {
    public static void main(String[] args) {
        /*When squirrels get together for a party, they like to have cigars.
        A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
         Unless it is the weekend, in which case there is no upper bound on the number of cigars.
         Return true if the party with the given values is successful, or false otherwise.
         */


        System.out.println(cigarParty(30, true));

    }


    public static boolean cigarParty(int cigars, boolean isWeekend) {
        //weekend -- >=40 && isWeekend   -!isWeekend && 40<=x<=60


        if (isWeekend && cigars >= 40) {
            return true;
        } else if (!isWeekend && (cigars <= 60 && cigars >= 40)) {
            return true;
        } else {
            return false;
        }


    }


}

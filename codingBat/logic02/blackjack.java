package logic02;

public class blackjack {
    public static void main(String[] args) {
/*Given 2 int values greater than 0,
return whichever value is nearest to 21 without going over.
Return 0 if they both go over.
 */

    }

    public int blackjack(int a, int b) {
        int diff1 = 21 - a;
        int diff2 = 21 - b;

        if ((a > 0 && b > 0)) {
            if (diff1 > diff2) {
                    return diff2;
            }
            else{
                return diff1;
            }
        }
        else {
            if(diff1<0){
                return b;
            }
            else{
                return a;
            }
        }

    }


}

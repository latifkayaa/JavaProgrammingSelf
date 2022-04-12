package logic01;

public class withoutDoubles {
    public static void main(String[] args) {

    }

    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {

        if (noDoubles) {
            if (die1 == 6 || die2 == 6) {
                return 7;
            } else if(die1==die2){
                return die1 + die2 + 1;
            }
            else{
                return die1+die2;
            }
        } else {
            return die1 + die2;
        }
    }
}


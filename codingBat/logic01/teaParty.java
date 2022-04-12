package logic01;

public class teaParty {
    public static void main(String[] args) {

        System.out.println(teaParty(5,10));
    }

    public static int teaParty(int tea, int candy) {

        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea >= 2 * candy || candy >= tea * 2) {
            return 2;
        }
        else {
            return 1;
        }
    }

}

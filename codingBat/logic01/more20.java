package logic01;

public class more20 {
    public static void main(String[] args) {

        System.out.println(more20(15));

    }

    public static boolean more20(int n) {
        if((n%20==1) || (n%20==2)){
            return true;
        }
        else {
            return false;
        }
    }

}

package logic01;

public class old35 {
    public static void main(String[] args) {

        System.out.println(old35(9));
    }

    public static boolean old35(int n) {
        if((n%3==0 || n%5==0) && n%15!=0){
            return true;
        }
        else {
            return false;
        }
    }
}

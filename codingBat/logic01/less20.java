package logic01;

public class less20 {
    public static void main(String[] args) {

        System.out.println(less20(15));
    }

    public static boolean less20(int n) {

        if(n%20 ==18 || n%20==19){
            return true;
        }
        else {
            return false;
        }
    }
}

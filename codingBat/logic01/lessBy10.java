package logic01;

public class lessBy10 {
    public static void main(String[] args) {

    }

    public boolean lessBy10(int a, int b, int c) {
        int diff1= Math.abs(a-b);
        int diff2= Math.abs(a-c);
        int diff3= Math.abs(c-b);

        if(diff1>=10 ||diff2>=10 ||diff3>=10 ){
            return true;
        }
        else{
            return false;
        }


    }

}

package logic01;

public class twoAsOne {
    public static void main(String[] args) {

    }
    public boolean twoAsOne(int a, int b, int c) {

        if((a+b==c) || (a+c==b)||(b+c==a)){
            return true;
        }else {
            return false;
        }
    }

}

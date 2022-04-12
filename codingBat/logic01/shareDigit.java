package logic01;

public class shareDigit {
    public static void main(String[] args) {

    }

    public boolean shareDigit(int a, int b) {
        int mod1 = a % 10;
        int mod2 = b % 10;
        int left = a / 10;
        int right = b / 10;

        if ((mod1==mod2 || mod1==right) || (left==mod2 || left==right))
            return true;
        else
            return false;
    }

}

package logic01;

public class nearTen {
    public static void main(String[] args) {

        System.out.println(nearTen(19));
    }

    public static boolean nearTen(int num) {

        int diff = (num%10);

        if(Math.abs(diff)==9 ||Math.abs(diff)==8 ||Math.abs(diff)==2 ||Math.abs(diff)==1 || Math.abs(diff)==0){
            return true;
        }
        else {
            return false;
        }
    }

}

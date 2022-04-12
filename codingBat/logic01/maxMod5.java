package logic01;

public class maxMod5 {
    public static void main(String[] args) {

    }

    public static int maxMod5(int a, int b) {

        if(a==b){
            return 0;
        }
        else if(a%5==b%5){
            if(a<b){
                return a;
            }
            else{
                return b;
            }
        }
        else{
            if(a<b){
                return b;
            }
            else{
                return a;
            }
        }
    }

}

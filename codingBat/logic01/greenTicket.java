package logic01;

public class greenTicket {
    public static void main(String[] args) {

    }

    public static int greenTicket(int a, int b, int c) {

        if(a==b && b==c){
            return 20;
        }
        else if((a==b || a==c || b==c)){
            return 10;
        }
        else{
            return 0;
        }
    }

}

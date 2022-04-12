package logic01;

public class redTicket {
    public static void main(String[] args) {

    }

    public int redTicket(int a, int b, int c) {

        if(a==2 && b==a && a==c){
            return 10;
        }
        else if(a==b && b==c){
            return 5;
        }
        else if(a!=b && a!=c){
            return 1;
        }
        else{
            return 0;
        }
    }

}

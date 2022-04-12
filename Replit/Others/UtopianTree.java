package Others;

public class UtopianTree {
    public static void main(String[] args) {
        int growth= 0;
        for (int i = 1; i <=10 ; i++) {
            if(i<=3){
                growth+=1;
                System.out.println("year "+i + " - growth 1 cm\ntree size: "+ growth +"cm");
            }
            else{
                growth+=2;
                System.out.println("year "+i + " - growth 2 cm\ntree size: "+ growth +"cm");
            }
        }


    }
}

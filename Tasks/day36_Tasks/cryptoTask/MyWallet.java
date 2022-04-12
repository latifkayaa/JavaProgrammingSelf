package day36_Tasks.cryptoTask;

public class MyWallet {

    public static void main(String[] args) {

        Bitcoin b1= new Bitcoin(46900, 1, 10L, 100L,  false);
        Cardano c1= new Cardano(3_400, 10, 20, 100,  true);
        Doge d1= new Doge(125, 250, 30, 1000, true);
        Etherium e1= new Etherium(0.6, 10000,  100, 1000, true);
        XRP x1= new XRP(34000, 1, 50L, 100L,  false);

        double fund= b1.totalPrice()+ c1.totalPrice()+ d1.totalPrice()+ e1.totalPrice()+x1.totalPrice();
        System.out.println("fund = " + fund);

    }
}

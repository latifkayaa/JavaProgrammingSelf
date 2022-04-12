package day36_Tasks.cryptoTask;

public class CryptoToken {

    public double price;
    public int quantity;
    public long marketCap;
    public long circulatingSupply;
    public boolean isMineable;

    public CryptoToken(double price, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
        this.price = price;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.circulatingSupply = circulatingSupply;
        this.isMineable = isMineable;
    }

    public double totalPrice(){
        return (price*quantity);
    }

    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                ", total price=" + totalPrice() +
                '}';
    }
}

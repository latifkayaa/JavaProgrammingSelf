package day35_Tasks.carpet;

public class Carpet {

    private int width;
    private int length;
    private double unitPrice;
    private boolean isPersian;

    public Carpet(int width, int length, double unitPrice, boolean isPersian) {
        setWidth(width);
        setLength(length);
        setUnitPrice(unitPrice);
        setPersian(isPersian);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0) {
            System.err.println("Invalid entry: " + width);
            return;
        }
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length <= 0) {
            System.err.println("Invalid entry: " + length);
            return;
        }
        this.length = length;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice <= 0) {
            System.err.println("Invalid entry: " + unitPrice);
            return;
        }
        this.unitPrice = unitPrice;
    }

    public boolean isPersian() {
        return isPersian;
    }

    public void setPersian(boolean persian) {
        isPersian = persian;
    }

    public double calcCost(){
        double cost =(width*length)*unitPrice;
        if(isPersian==true){
            cost+=200;
        }
        return cost;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", cost=" + calcCost() +
                '}';
    }
}

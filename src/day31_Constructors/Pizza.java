package day31_Constructors;

public class Pizza {
    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;
    public int price=0;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public void baseCost(){
        if(size== 'S'){
            price=10;
        }
        else if(size == 'M'){
            price=12;
        }
        else{
            price=14;
        }
    }


    public void calcCost(){
        price += 2*(numberOfCheeseTopping+numberOfPepperoniTopping);
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", price=" + price +
                '}';
    }
}

package day31_Constructors;

public class PizzaOrdering {
    public static void main(String[] args) {


        Pizza pizza1 = new Pizza('L', 5, 7);
        pizza1.baseCost();
        pizza1.calcCost();
        System.out.println(pizza1);


    }
}

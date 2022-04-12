package day35_Tasks.pizza;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;


    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(size == null){
            System.err.println("Size can not be null");
            System.exit(1);
        }
        if (!( size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large") ) ) {
            System.err.println("Invalid Size: "+size);
            System.exit(1);
        }
        this.size = size;

    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if(numberOfCheeseTopping < 0){
            System.out.println("Invalid number of cheese topping: "+numberOfCheeseTopping);
            System.exit(1);
        }

        if(size.equalsIgnoreCase("small") && numberOfCheeseTopping <= 3){
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        }else if(size.equalsIgnoreCase("medium") && numberOfCheeseTopping <= 4){
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        }else if(size.equalsIgnoreCase("large") && numberOfCheeseTopping <= 5){
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        }else{
            System.out.println("Invalid number of cheese topping: "+numberOfCheeseTopping);
            System.exit(1);
        }
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if(numberOfPepperoniTopping < 0){
            System.out.println("Invalid number of pepperoni topping: "+numberOfPepperoniTopping);
            System.exit(1);
        }

        if(size.equalsIgnoreCase("small") && numberOfPepperoniTopping <= 3){
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        }else if(size.equalsIgnoreCase("medium") && numberOfPepperoniTopping <= 4){
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        }else if(size.equalsIgnoreCase("large") && numberOfPepperoniTopping <= 5){
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        }else{
            System.out.println("Invalid number of pepperoni topping: "+numberOfPepperoniTopping);
            System.exit(1);
        }
    }

    public int calcCost() {
        int cost=0;
        if (size.equalsIgnoreCase("small")) {
            cost = 10;
        } else if (size.equalsIgnoreCase("medium")) {
            cost = 12;
        } else {
            cost = 14 ;
        }
        return (cost+(numberOfCheeseTopping + numberOfPepperoniTopping) * 2);

    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", cost=" + calcCost() +
                '}';
    }
}

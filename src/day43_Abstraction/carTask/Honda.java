package day43_Abstraction.carTask;

public final class Honda extends Car{


    public Honda( String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println(getClass().getSimpleName() + " needs to twist the key for ignition.");
    }


}

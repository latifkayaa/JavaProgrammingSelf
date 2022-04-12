package day23_Tasks;

public class Task9_ConvertUsdToEuros {
    public static void main(String[] args) {
    //9. create a method that can convert dollar to euro
        convertUSDToEuro(1000);
    }

    public static void convertUSDToEuro (int dollars){
        double euros = dollars *1.10;
        System.out.println("euros = " + euros);
    }


}

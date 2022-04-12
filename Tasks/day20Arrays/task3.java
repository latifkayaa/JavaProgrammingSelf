package day20Arrays;

public class task3 {

    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 , 439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349, 12350};


        for (int i = 0; i < items.length; i++) {
            if(items[i].equalsIgnoreCase("gloves")){
                System.out.println("Index number of gloves is: "+ i);
            }
        }

        for (int i = 0; i < items.length; i++) {
            if(!(items[i].equalsIgnoreCase("ipad"))){
                continue;
            }
            else {
                System.out.println("Yes, iPad is on the list.");
            }
        }

        for (int i = 0; i < items.length; i++) {
            System.out.println("Item's name: " + items[i] + "-\tPrice is: $" + prices[i] + "-\t#ID: " + itemIDs[i]);
        }


    }
}

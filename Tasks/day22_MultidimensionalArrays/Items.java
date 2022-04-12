package day22_MultidimensionalArrays;

public class Items {
    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};

        //Normal list
        for (String[] item : items) {
            for (String each : item) {
                System.out.print(each + "\t");
            }
            System.out.println();
        }
        System.out.println("--------");

        //Each array reversed
        for (int i = 0; i < items.length; i++) {
            for (int j = items[i].length - 1; j >= 0; j--) {
                System.out.print(items[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("--------");
        //Start from the last
        for (int i = items.length-1; i>=0 ; i--) {
            for (int j = 0; j <items[i].length ; j++) {
                System.out.print(items[i][j] + "\t");
            }
            System.out.println();
        }


    }


}

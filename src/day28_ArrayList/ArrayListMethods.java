package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> employers = new ArrayList<>();
        employers.add("Ali");
        employers.add("Coşkun");
        employers.add("Suat");
        employers.add("Ömer");
        System.out.println("employers = " + employers);
        employers.remove(0);
        employers.remove(0);
        System.out.println("employers = " + employers);
        employers.remove("Suat");
        System.out.println("employers = " + employers);



    }
}

package day28_ArrayList;
import  java.util.ArrayList;

public class ArrayListMethod1 {
    public static void main(String[] args) {

        ArrayList <Integer> numbers   = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(2,5);

        System.out.println("numbers = " + numbers);

        System.out.println(numbers.size());
        System.out.println(numbers.lastIndexOf(40));
        System.out.println(numbers.get(5));

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i)+ " ");
        }

        System.out.println("--------");

        ArrayList <String> list = new ArrayList<>();
        list.add("Java");
        list.add("Phyton");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        System.out.println(list);

        list.set(2, "Javascript");
        System.out.println(list);



    }
}

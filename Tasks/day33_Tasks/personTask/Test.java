package day33_Tasks.personTask;

public class Test {
    public static void main(String[] args) {

        Person person1 = new Person("Latif", 28, 'M');
        System.out.println(person1);

        boolean result1 = person1.hasWings;
        System.out.println("result1 = " + result1);

        person1.eat("Pizza");
        person1.drink("Wine");
        person1.sleep();


    }
}

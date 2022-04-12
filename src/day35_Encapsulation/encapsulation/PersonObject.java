package day35_Encapsulation.encapsulation;

public class PersonObject {
    public static void main(String[] args) {

        Person person1= new Person();
        person1.setAge(28);
        person1.setName("Latif");
        System.out.println(person1);
        System.out.println(person1.getName() + " "+ person1.getAge());
        System.out.println("------------");

        Person person2= new Person();
        person2.setAge(180);
        person2.setName("Ali");
        System.out.println(person2);

        System.out.println(person2.getName()+ " "+ person2.getAge());
    }
}

package day35_Encapsulation;

public class Person {

    public String name;
    public int age;
    public char gender;
    public String language;
    static String planet;
    static boolean isHuman;
    static boolean hasNose;
    static int numberOfWings;
    static int numberOfHead;

    //Initializing the statics
    static {
        planet="Earth";
        isHuman=true;
        hasNose=true;
        numberOfWings=0;
        numberOfHead=1;
    }

    //Constructor for the instances, initiliazing the fields
    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    public static void printPlanetName(){
        System.out.println("The person is from the planet: "+ planet);
    }
    public void eat(String food){
        System.out.println(name+ " is eating "+ food);
    }

    public void drink(String drink){
        System.out.println(name+ " is drinking "+ drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                '}';
    }
}

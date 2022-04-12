package day31_Constructors;

public class Person {
    //name, gender, age
    //Instance variables
    public String name;
    public char gender;
    public int age;

    //Constructor
    public Person(String name, char gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }


}

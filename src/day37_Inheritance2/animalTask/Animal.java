package day37_Inheritance2.animalTask;

public class Animal {

    public String name;
    public String breed;
    public char gender;
    public int size;
    public String age;
    public String color;
    public int tail;

    public Animal(String name, String breed, char gender, int size, String age, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+ " is drinking");
    }

    public void  move(){
        System.out.println(name+ " is moving");
    }

    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Animal:
		name, breed, gender, size, age, color
		setInfo(), eat(), drink(), move(), sleep(), toString()
 */
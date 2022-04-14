package day39_Tasks.animalTask;

public class Cat extends FriendlyAnimal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void scratch(){
        System.out.println(getName()+" is scratching");
    }
}

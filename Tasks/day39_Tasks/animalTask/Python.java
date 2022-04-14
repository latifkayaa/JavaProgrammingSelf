package day39_Tasks.animalTask;

public class Python extends WildAnimal{


    public Python(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    @Override
    public void hunt() {
        System.out.println("Python "+getName()+" hunts lizards");
    }
}

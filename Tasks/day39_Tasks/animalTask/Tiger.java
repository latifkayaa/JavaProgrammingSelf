package day39_Tasks.animalTask;

public class Tiger extends WildAnimal{

    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void hunt() {
        System.out.println("Tiger "+getName()+" hunts deers");
    }

}

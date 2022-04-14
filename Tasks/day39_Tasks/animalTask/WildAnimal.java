package day39_Tasks.animalTask;

public class WildAnimal extends Animal{

    public static boolean isWild=true;
    public static boolean isFriendly=false;
    public static boolean isPlayable=false;

    public WildAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void hunt(){
        System.out.println(getName()+" is hunting");
    }



}

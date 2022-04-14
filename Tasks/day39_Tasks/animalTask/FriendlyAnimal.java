package day39_Tasks.animalTask;

public class FriendlyAnimal extends Animal{

    public static boolean isWild=false;
    public static boolean isFriendly=true;
    public static boolean isPlayable=true;


    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    public void pet(){
        System.out.println(getName()+" likes being petted");
    }

    public void playing(){
        System.out.println(getName()+" is playing");
    }


}

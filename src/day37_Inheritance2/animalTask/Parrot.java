package day37_Inheritance2.animalTask;

public class Parrot extends Animal{

    public String parrotWingColor;

    public Parrot(String name, String breed, char gender, int size, String age, String color) {
        super(name,breed,gender,size,age,color);
    }
    public void sing(){
        System.out.println(name+" is singing");
    }




}

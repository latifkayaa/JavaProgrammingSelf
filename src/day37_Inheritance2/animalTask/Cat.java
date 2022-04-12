package day37_Inheritance2.animalTask;

public class Cat extends Animal{

    public int tail;


    public Cat(String name, String breed, char gender, int size, String age, String color){
        super(name,breed,gender,size,age,color);
    }

    public void scratch(){
        System.out.println(name+" is scratching");
    }


}

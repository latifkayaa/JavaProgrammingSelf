package day38_Tasks.animalTask;

import com.sun.security.jgss.GSSUtil;

public class Tiger extends Animal{

    public Tiger(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " eats deer.");
    }
}

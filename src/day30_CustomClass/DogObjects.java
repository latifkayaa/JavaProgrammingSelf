package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        System.out.println(dog1);

        System.out.println("-------------------");

        Dog dog2 = new Dog();
        dog2.name = "Loki";
        dog2.breed = "Husky";
        dog2.age = 1;
        dog2.gender = 'M';
        dog2.size = "Medium";
        dog2.color = "Black";
        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("Ace", "Spanish", 6, 'F', "Medium", "White");
        System.out.println(dog3);

        Dog dog4 = new Dog();
        dog4.setInfo("Asky", "French Bulldog", 6, 'M', "Medium", "White");
        System.out.println(dog4);

        Dog dog5 = new Dog();
        dog5.setInfo("Tusky", "German Shephard", 6, 'F', "Medium", "White");
        System.out.println(dog5);
        System.out.println("----------------");

        Dog [] dogList = {dog1,dog2,dog3,dog4, dog5};

        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogList));
        ArrayList<Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogList));

        maleDogs.removeIf(p-> p.gender == 'F');
        femaleDogs.removeIf(p-> p.gender == 'M');
        System.out.println("femaleDogs = " + femaleDogs + "\nFemale dog count is: " + femaleDogs.size() );
        System.out.println("maleDogs = " + maleDogs+ "\nMale dog count is: " + maleDogs.size());

    }
}

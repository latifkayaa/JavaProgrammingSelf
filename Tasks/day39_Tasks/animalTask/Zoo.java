package day39_Tasks.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Cat cat1= new Cat("Garfield", "British", 'F', 4, "L", "Orange");
        cat1.scratch();
        cat1.drink();
        cat1.eat();
        System.out.println("cat1 = " + cat1);

        Tiger tiger1= new Tiger("Olra", "Bengal", 'M', 8, "L", "White");
        Lion lion1= new Lion("Arsan", "African", 'F', 12, "L", "Red");
        tiger1.hunt();
        lion1.hunt();
        System.out.println("lion1 = " + lion1);
        System.out.println("tiger1 = " + tiger1);






    }
}

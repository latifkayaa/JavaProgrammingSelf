package day39_Tasks.animalTask;

public class Animal {

    private String name;
    private String breed;
    private char gender;
    private int age;
    private String size;
    private String color;

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setSize(size);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){
            System.out.println("Name cannot be null.");
            System.exit(0);
        }
        if((name.isBlank()|| name.isEmpty())){
            System.out.println("Name cannot be blank or empty.");
            System.exit(0);
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if(breed==null){
            System.out.println("Breed cannot be null.");
            System.exit(0);
        }
        if((breed.isBlank()|| breed.isEmpty())){
            System.out.println("Breed cannot be blank or empty.");
            System.exit(0);
        }
        this.breed = breed;
    }

    public char getGender() {
        if(!(gender=='M' || gender=='F')){
            System.out.println("Gender cannot be other than 'M' or 'F'.");
            System.exit(0);
        }
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("Name cannot be smaller than 0.");
            System.exit(0);
        }
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color==null){
            System.out.println("Breed cannot be null.");
            System.exit(0);
        }
        if((color.isBlank()|| color.isEmpty())){
            System.out.println("Breed cannot be blank or empty.");
            System.exit(0);
        }
        this.color = color;
    }

    public void eat(){
        System.out.println("");
    }

    public void drink(){
        System.out.println(name+" drinks water");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void move(){
        System.out.println(name+" is moving");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

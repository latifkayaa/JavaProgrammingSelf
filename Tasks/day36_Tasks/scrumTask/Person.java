package day36_Tasks.scrumTask;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    //Name can't be empty or blank
    public void setName(String name) {
        if((name.isEmpty() || name.isBlank())){
            System.out.println("Name can't be empty or blank.");
            System.exit(0);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0 || age>150){
            System.out.println("Age can't be smaller than 0 or bigger than 150");
            System.exit(0);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender== 'M' || gender=='F')){
            System.out.println("Gender can be only M or F.");
            System.exit(0);
        }
        this.gender = gender;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

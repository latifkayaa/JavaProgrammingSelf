package day36_Tasks.scrumTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int ID, double salary) {
        super(name, age, gender, ID, "Developer", salary);
    }

    public void fixBugs(){
        System.out.println(getName()+" is fixing bugs");
    }

}

package day43_Abstraction.employeeTask;

public final class Teacher extends Employee{

    public Teacher(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching.");

    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is slepping 8 hours.");

    }
}

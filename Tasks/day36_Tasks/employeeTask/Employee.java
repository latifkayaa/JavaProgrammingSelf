package day36_Tasks.employeeTask;

public class Employee {

    public String name;
    public char gender;
    public int age;
    public int ID;
    public String jobTitle;
    public double salary;

    public void setInfo(String name, char gender, int age, int ID, double salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        jobTitle= getClass().getSimpleName();
        //this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void work(){
        System.out.println(name + " as a "+ jobTitle+ " is working.");
    }

    public String toString() {
        return "Employee{" + getClass().getSimpleName()+
                "'s name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

/*
2.1 Create a class named Employee:
			variables:
				name, gender, age, id, jobTitle, salary
			Methods:
				setInfo()
				work()
				toString()
 */
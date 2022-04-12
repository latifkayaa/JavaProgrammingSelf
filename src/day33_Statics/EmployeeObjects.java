package day33_Statics;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1= new Employee();
        Employee employee2= new Employee();
        Employee employee3= new Employee();

        employee1.name="Ali";
        System.out.println(employee1.name);

        employee2.name="Ahmet";
        System.out.println(employee2.name);

        employee3.name="Akra";
        System.out.println(employee3.name);

        System.out.println(employee1.name);
        System.out.println(employee2.name);

        System.out.println(employee1.isHuman);
        System.out.println(employee1.isHuman);
        System.out.println(employee1.isHuman);

    }
}

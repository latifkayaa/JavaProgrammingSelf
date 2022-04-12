package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Ali", 1000, 'M', "QA", 90_000.0, true);

        Employee employee2 = new Employee();
        employee2.setInfo("Coşkun", 2000, 'M', "SDET", 80_000.0, false);

        Employee employee3 = new Employee();
        employee3.setInfo("Ömer", 3000, 'M', "Dev", 110_000.0, true);


        Employee employee4 = new Employee();
        employee4.setInfo("Mehmet", 4000, 'M', "Dev", 120_000.0, true);


        Employee employee5 = new Employee();
        employee5.setInfo("Latif", 5000, 'M', "SM", 85_000.0, false);

        //Create an array of employees

        Employee [] employees = {employee1, employee2, employee3, employee4, employee5};

        ArrayList<Employee> fullTime= new ArrayList<>(Arrays.asList(employees));
        fullTime.removeIf(p-> p.isFullTime == false);
        int fullTimeCount = fullTime.size();
        System.out.println("Full time employee number is= " + fullTimeCount);

        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;

        ArrayList <Employee> employeeList = new ArrayList<>(Arrays.asList(employees));
        //Find max and min salary
        for (Employee employee : employeeList) {
            if(employee.salary<min){
                min = employee.salary;
            }
            if(employee.salary>max){
                max = employee.salary;
            }
        }

        System.out.println("employeeList = " + employeeList);
        System.out.println("min salary = " + min);
        System.out.println("max salary = " + max);




    }


}

package day08_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {

    int hourlyRate = 50, weeklyHours= 45;
    double stateTaxRate = 6.5 , federalTaxRate= 26.2 ;

//Salary Before Tax ---

        double salary = hourlyRate * weeklyHours * 52;
        System.out.println("Gross pay is= $" + salary);

        double stateTax= salary * stateTaxRate /100;
        System.out.println("State Tax = $" + stateTax);

        double federalTax= salary* federalTaxRate/100;
        System.out.println("federalTax = " + federalTax);

        double totalTax = stateTax + federalTax;
        System.out.println("totalTax = " + totalTax);
        salary -=totalTax;
        System.out.println("Net income= " + salary);



    }
}

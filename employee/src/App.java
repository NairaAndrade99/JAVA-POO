import java.util.Scanner;
import employee.employee.*;

public class App {
    public static void main(String[] args) throws Exception {
         
        Scanner sc = new Scanner (System.in);
        
        Employee employee = new Employee ();

        System.out.println("Name: ");
        employee.name = sc.nextLine();

        System.out.println("Gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.println("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee);

        System.out.println("Wich percentage to increase salary ? ");
        double perce = sc.nextDouble();
        employee.increaseSalary(perce);

        System.out.println("Employee: " + employee);



        
    }
}

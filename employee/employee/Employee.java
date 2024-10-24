package employee.employee;

public class Employee {
    public String name;
    public double grossSalary, tax;

public double netSalary (){
    return grossSalary -= tax;

}
public void increaseSalary(double percentage){
     grossSalary += percentage / 100 * netSalary();
     
}
public String toString(){
     return name +
            String.format(", $ %.2f ", netSalary())
            + name +
            String.format("$ ", grossSalary);
}

}

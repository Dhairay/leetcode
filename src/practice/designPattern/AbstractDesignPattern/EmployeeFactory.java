package practice.designPattern.AbstractDesignPattern;

public class EmployeeFactory {
    //get employee

    public static Employee getEmployee(EmployeeAbstractFactory factory){
        return factory.createEmployee();
    }
}

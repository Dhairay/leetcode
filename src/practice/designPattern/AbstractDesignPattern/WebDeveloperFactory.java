package practice.designPattern.AbstractDesignPattern;

public class WebDeveloperFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new WebDeleloper();
    }
}

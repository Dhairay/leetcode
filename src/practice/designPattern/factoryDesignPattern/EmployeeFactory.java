package practice.designPattern.factoryDesignPattern;


public class EmployeeFactory {
    public static Employee getEmployee(String empType) {
        if (empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
            return new AndroidDeveloper();
        } else if (empType.trim().equalsIgnoreCase("WEB DEVELOPER")) {
            return new WebDeveloper();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Employee employee=getEmployee("Android developer");
        System.out.println(employee.salary());

    }
}

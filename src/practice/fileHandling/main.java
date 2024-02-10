package practice.fileHandling;

import java.io.*;

public class main {
    public static void main(String[] args) {
        main m=new main();
        Employee e = new Employee(1, "Dhairay", "kansal");
        m.saveOnSystem(e);
        m.writeFromSystem();
    }

    private void saveOnSystem(Employee employee) {
        try (final FileOutputStream fileOutputStream = new FileOutputStream("Employee.txt")) {
            final ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void writeFromSystem() {
        try (final FileInputStream fileInputStream = new FileInputStream("Employee.txt")) {
            final ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Employee employee = (Employee) objectInputStream.readObject();
            System.out.println(employee.toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

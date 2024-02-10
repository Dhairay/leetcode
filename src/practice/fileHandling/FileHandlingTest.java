package practice.fileHandling;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * This class is for learning the File Handling
 *
 * @author Nikhil
 * @version 1
 * @since 2024 Feb
 */

class Student implements Serializable {
    private String name;
    private String surName;
    private transient int rollNum;      // To Exclude variable from serilaziation we use transient

    static int number = 8;


    public Student(String name, String surName, int rollNum) {
        this.name = name;
        this.surName = surName;
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", rollNum=" + rollNum +
                ", number=" + number +
                '}';
    }
}

public class FileHandlingTest {
    public static void main(String[] args) {
        List<Student> st = new LinkedList<>();

        FileHandlingTest fileHandlingTest = new FileHandlingTest();
        Student myStudent = new Student("Nikhil", "Summi", 24);
        Student s1 = new Student("Nitish", "Kansal", 23);
        Student s2 = new Student("Daksh", "Summi", 5);
        st.add(myStudent);
        st.add(s1);
        st.add(s2);
        System.out.println(st.toString());
        fileHandlingTest.saveOnLocalSystem(st);
        fileHandlingTest.readFromLocalSystem();

    }

    /**
     * This method is to save Student object in file system
     *
     * @param student input object
     */

    // This is how Serilzation is done
    private void saveOnLocalSystem(List<Student> student) {

        // this.printStudent((Student) student);
        try (final FileOutputStream fileOutputStream = new FileOutputStream("student.txt")) {
            final ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // This is how De-Serilzation is done
    private void readFromLocalSystem() {
        try (final FileInputStream fileInputStream = new FileInputStream("student.txt")) {
            final ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Student> student = (LinkedList<Student>) objectInputStream.readObject();
            for(Student st: student)
            System.out.println(st);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void printStudent(Student student) {
        System.out.println(student.toString());
    }
}

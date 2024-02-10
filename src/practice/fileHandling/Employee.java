package practice.fileHandling;

import java.io.Serializable;

class People implements Serializable {
    public String surName;
}

public class Employee extends People {

    private static final long serialVersionUID = 1L;
    private int id;
    private String name;

    public Employee(int id, String name, String surName) {
        this.id = id;
        this.surName = surName;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}

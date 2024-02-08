package practice.collections;

import java.util.Scanner;

class Employee{
    private int id;
    private String name;
public Employee(){
    int id=12;
    String name="NAme";
}



    public Employee(int a, String b){
     this.id=a;
    this.name=b;


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
}


public class aiseHi

{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee em=new Employee(12,"Dhiray");
        System.out.println(em.getId());
        System.out.println(em.getName());




    }

    }


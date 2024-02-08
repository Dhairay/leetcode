package practice.collections;


import java.util.*;

class Student
{
  int rollNo;
  String name;
  int age;
  Student(int rollNo, String name, int age)
    {

        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && age == student.age && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name, age);
    }
}
public class UserDefinedArray
{
    public static void main(String[] args) {
        //user-defined Class Object
        Student s1=new Student(101,"Pradeep",22);
        Student s2=new Student(102,"Aashish",23);
        Student s3=new Student(103,"Sumit",24);
        Student s4=new Student(103,"Sumit",24);
        Student s5=new Student(103,"Sumit",24);
        //Creation of array list
        ArrayList <String> arr =new ArrayList<>();
        Collection<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);


        for (Student data: students) {
            System.out.println(data);
        }
    }
}

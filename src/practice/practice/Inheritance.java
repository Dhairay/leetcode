package practice.practice;

import java.util.Scanner;
class Address {
    int Hno;
    String city, state, Name;

    void getAddress() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name --> ");
        Name = sc.nextLine();
        System.out.println("Enter Your City --> ");
        city = sc.nextLine();
        System.out.println("Enter Your State --> ");
        state = sc.nextLine();
        System.out.println("Enter Your Hno --> ");
        Hno = sc.nextInt();
    }

    void putAddress() {
        System.out.println("Enter Your name --> " + Name);
        System.out.println("Enter Your State --> " + state);
        System.out.println("Enter Your City --> " + city);
        System.out.println("Enter Your Hno -->  " + Hno);
    }
}

class People {
    String name;
    int age;
    String gender;

}
    class Student extends People   //  -- is a
    {
        int roll;
        String section;

        Address address;     // -- has a
        void getStudent()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your Student name ->");
            name=sc.nextLine();
            System.out.println("Enter your Student roll ->");
            roll=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter your Student section ->");
            section=sc.nextLine();

        }
        void putStudent()
        {
            System.out.println("Enter your Student name ->"+name);
            System.out.println("Enter your Student roll ->"+roll);
            System.out.println("Enter your Student section ->"+section);

        }
    }

public class Inheritance
{
    public static void main(String[] args)
    {

          Student ad=new Student();
          ad.getStudent();
          ad.address.putAddress();
          ad.putStudent();
          ad.address.getAddress();
    }
}

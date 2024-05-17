package practice.designPattern.factoryDesignPattern;

public interface Employee {

     int salary();
}
class AndroidDeveloper implements Employee{

     @Override
     public int salary() {
          System.out.println("Getting salary of a Android Developer");
          return 20000;
     }

}
class WebDeveloper implements Employee{

     @Override
     public int salary() {
          System.out.println("Getting salary of a Web Developer");
          return 50000;
     }
}
/*
*1. when there is superclass and multiple subclass, and we want to get object of subclass based on input and requirement then it is known as factory design pattern
*2. Then we create factory class which takes the responsibility of creating object of class based on input
*3. Hide information from the client
* -----------------------------------------------------------------------------------------------------------------------
* Advantages:-
*
*1. Focus on creating object for interface rather than implementation
*2. Loose coupling , more robust code
*/
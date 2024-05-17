package practice.designPattern.singletonDesign;

import java.io.*;
import java.lang.reflect.Constructor;

public class SingletonObj1 implements Serializable,Cloneable {

    //Eager way to create Singleton object
    private static SingletonObj1 eagerSingletonObj2 = new SingletonObj1();

    public static SingletonObj1 getEagerSingletonObj2() {

        return eagerSingletonObj2;
    }

    private static SingletonObj1 lazySingletonObj1;
    private SingletonObj1() {
        if (lazySingletonObj1 != null) {
            throw new RuntimeException("You are Break Singleton pattern ");
        }

    }

    //Lazy way to create single object
    public static SingletonObj1 getLazySingletonObj1() {
        //Object of this class
        if (lazySingletonObj1 == null) {
            synchronized (SingletonObj1.class) {
                if (lazySingletonObj1 == null) {
                    lazySingletonObj1 = new SingletonObj1();
                }
            }
        }
        return lazySingletonObj1;
    }

    public Object readResolve(){
        return lazySingletonObj1;
    }

    public Object clone(){
        return lazySingletonObj1;
    }

    public static void main(String[] args) throws Exception {
        SingletonObj1 s1 = SingletonObj1.getLazySingletonObj1();

        System.out.println(s1.hashCode());

//        SingletonObj1 s2=SingletonObj1.getLazySingletonObj1();
//
//        System.out.println(s2.hashCode());
//
//        System.out.println(SingletonObj1.getEagerSingletonObj2().hashCode());

        //Reflection

        Constructor<SingletonObj1> constructor = SingletonObj1.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonObj1 s2 = constructor.newInstance();
        System.out.println("Reflection---->"+s2.hashCode());

        //Deserialization

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(s1);

        System.out.println("serialization done");

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ob"));
        SingletonObj1 s4=(SingletonObj1) ois.readObject();
        System.out.println("Deserialization------>"+s4.hashCode());

        //Cloning

        SingletonObj1 s3=(SingletonObj1) lazySingletonObj1.clone();
        System.out.println("Cloning----->"+s3.hashCode());
    }

}
/*
 *
 *1. Constructor private
 *
 *2. object Create with the help of method
 *
 * 3. create field to store is private
 *----------------------------------------------------------
 * 1. Reflection API to break singleton Pattern
 * solution:1 -> if object is there => throw exception from inside constructor
 * solution:2 -> Use Enum
 *
 * 2.Deserialization
 *solution:1 -> Implementing read resolve method
 *
 * 3.Cloning
 * solution:1 -> Implementing clone method and return the instance
 */
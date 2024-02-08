package practice.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args)
    {
        List <Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add(i);
           // System.out.println(myList);

        }
        System.out.println(myList);

        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }

        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        System.out.println(myList);

    }
}

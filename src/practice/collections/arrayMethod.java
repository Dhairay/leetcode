package practice.collections;

import java.util.*;

public class arrayMethod
{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Manan");
        list.add("Arav");
        list.add("Tanish");
        list.add("Dhairay");
        list.add("Nitish");
        list.add("daksh");


        //reverse the array list
        Collections.reverse(list);
        // Sorting an array
        System.out.println("List After sorting");
        Collections.sort(list);

        //Assessing the Element from the list

        System.out.println("Returning Element from the list : "+list.get(1));  //it will return the element from second index

        //Changing the element

        list.set(1,"Prashant");


        System.out.println("Traversed elements through Iterator --> ");

        //Here, element iterates in reverse order

        ListIterator<String> itr = list.listIterator(list.size());
        while (itr.hasPrevious()) {
            String str = itr.previous();
            System.out.println(str);
        }

        // Traverse List using for each method

        System.out.println("For () Method of sorting a list :");
        for (String str: list)
        {
            System.out.println(str);
        }

        //Travese List through for loop

        System.out.println("traversed list through For loop : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //Traversing list using ForEach method

        System.out.println("Traversed List Through ForEach() :");

        //The for each method is the new method introduced in java 8

        list.forEach(a ->               // here are we using lamda expression
        {                               // this is also known as Streams

            System.out.println(a);
        });

        //Traversing list through for each remaining method

        System.out.println("Traversed list through For Each remaining() :");
        Iterator <String> itr1= list.iterator();
        itr.forEachRemaining(a->{           // this method is only be use using Iterator expression
            System.out.println(a);
        });
    }
}

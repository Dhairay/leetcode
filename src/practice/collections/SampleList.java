package practice.collections;

import java.util.*;

public class SampleList
{
    public static void main(String[] args)
    {

      ArrayList <String> list=new ArrayList<String>();


        //Accessing the element
        System.out.println("Returning Element --> " + list.get(1));  //it will return the element from second index

        //Changing the Elements
        list.set(1,"Nitish");

        //Sorted List
        Collections.sort(list);


 /*         for(String name:list)
        {                                                     // Through for loop
            System.out.println(name);
        }
*/
        Iterator <String> itr=list.iterator() ; //Get the iterator

        //Through while loop
        while(itr.hasNext()) {                  //Check if iterator has element
            System.out.println(itr.next());}    //Print the element and move to next


         // Sorting random numbers

        ArrayList <Integer> num=new ArrayList<Integer>();
        num.add(99);
        num.add(12);
        num.add(53);
        num.add(4);
        num.add(12);
        num.add(43);
        num.add(42);
        num.add(23);

        //Sorting Arrays
        Collections.sort(num);
        for(Integer number:num)
        {
            System.out.println(number);
        }
        }
    }


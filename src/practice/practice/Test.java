package practice.practice;
import java.util.*;


class TestArray{
     ArrayList <Integer> a= new ArrayList<>(5);


    public ArrayList<Integer> getA() {
        a.add(1);
        a.add(4);
        a.add(3);
        a.add(7);
        a.add(5);
        a.add(2);
        a.add(6);
       Collections.sort(a);

        return a;
    }

}

public class Test {
        public static void main(String[] args) {

TestArray a=new TestArray();
     //       int size = a.a.size();
          //  System.out.println(a.getA());


            for (Integer c: a.getA()) {
                System.out.println(c);


            }

        }

}

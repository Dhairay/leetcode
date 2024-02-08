package practice.collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        String[] input = {"Nitesh", "Nikhil", "Nitesh", "Aarav", "Aarav"};
        Map<String, Integer> myMap = new HashMap<>();

        for(String in : input){
            if(myMap.containsKey(in)){
                int value = myMap.get(in);
                myMap.put(in, ++value);
            } else {
                myMap.put(in, 1);
            }
        }
        System.out.println(myMap);

    }
}

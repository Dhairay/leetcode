package practice.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest2
{
    public static void main(String[] args) {
        Map<String , String> phonebook=new HashMap<>();
        phonebook.put("manan" , " 941600120");
        phonebook.put("Aarav" , " 9416234320");
        phonebook.put("Nitish" , " 94342340120");
        phonebook.put("Tanish" , " 9443420");
        phonebook.put("Daksh" , " 23230120");
        phonebook.put("hawai" , "9416001280");

        // Map is an Interface and this is nested interface another interface inside of interface.
        // That is entry Interface inside of Map interface.
        //Map.entry = entry is a menthod which will give you set of entry
        Set<Map.Entry<String,String>> values=phonebook.entrySet();
        for(Map.Entry<String,String> e : values)
        {
            System.out.println(e.getKey() + ": " +e.getValue());
            e.setValue("III");

        }
    }
}

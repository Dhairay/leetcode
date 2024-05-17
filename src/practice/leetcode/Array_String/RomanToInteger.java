package practice.leetcode.Array_String;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        String thiss = "VIII";
        int result= romanToInt(thiss);
        System.out.println(result);
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);
        int n = s.length();
        int num = mp.get(s.charAt(n - 1));
        for (int i = n - 2; i >= 0; i--) {
            if (mp.get(s.charAt(i)) >= mp.get(s.charAt(i + 1))) {
                num += mp.get(s.charAt(i));
            } else
                num -= mp.get(s.charAt(i));
        }
        return num;
    }
}

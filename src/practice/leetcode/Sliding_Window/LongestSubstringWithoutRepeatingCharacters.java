package practice.leetcode.Sliding_Window;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int maxL = 0;
        List<Character> li = new ArrayList<>();
        while (j < s.length()) {
            if (!li.contains(s.charAt(j))) {
                li.add(s.charAt(j));
                j++;
                maxL = Math.max(maxL, li.size());
            } else {
                li.remove(Character.valueOf(s.charAt(i)));
                i++;
            }
        }


        return maxL;
    }
}

/*Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the
characters without disturbing the relative positions of the remaining characters.
(i.e., "ace" is a subsequence of "abcde" and "aec" is not).*/

package practice.leetcode.Two_Pointers;

public class IsSequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {

        int a = 0;
        String ss = "";

        for (int i = 0; i < t.length(); i++) {
            if (a<s.length() && s.charAt(a) == t.charAt(i)) {
                a++;
                ss += t.charAt(i);
            }
        }
        return s.contentEquals(ss);
    }
}

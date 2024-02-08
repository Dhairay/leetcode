/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing
all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
*/

package practice.leetcode.Two_Pointers;


public class ValidPalandrom {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static Object isPalindrome(String s) {

        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(s);
        StringBuilder ss = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            ss.append(s.charAt(i));
        }
        return (s.equals(ss.toString()));
    }
}

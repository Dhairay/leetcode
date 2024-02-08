package practice.leetcode.Array_String;

public class LengthOfLastElement {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWords(s));
    }

    public static int lengthOfLastWords(String s) {
        int count = 0;
        String str=s.trim();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}

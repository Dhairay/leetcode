package practice.leetcode.Array_String;

public class FindTheOccuerenceOfTheFirstIndexInTheString {
    public static void main(String[] args) {
        String hatstack = "leetcode";
        String needle = "code";
        System.out.println(strStr(hatstack,needle));
    }

    public static int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);
    }
}

package practice.leetcode.Array_String;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "  hello  world  ";
        System.out.println(reverseWords(s));

    }


    public static String reverseWords(String s) {
        StringBuilder sc = new StringBuilder();

        String[] a = s.split(" ");

        for (int i = a.length - 1; i >= 0; i--) {
            if(a[i].length() > 0){
                sc.append(a[i]).append(" ");

            }
        }
        return sc.toString().trim();
    }
}

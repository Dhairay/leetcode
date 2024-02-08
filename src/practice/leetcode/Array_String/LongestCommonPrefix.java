package practice.leetcode.Array_String;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs= {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static  String longestCommonPrefix(String[] strs) {
        StringBuilder result=new StringBuilder();

        // To sort the String
        Arrays.sort(strs);

        //get first and Last String
        char [] first=strs[0].toCharArray();
        char [] last=strs[strs.length-1].toCharArray();

        //Comparing
        for(int i=0;i< first.length;i++){
            if(first[i]!=last[i])
                break;
            result.append(first[i]);
            }

        return result.toString();
    }
}

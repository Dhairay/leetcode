/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears
only once.The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially.
The remaining elements of nums are not important as well as the size of nums.

Return k.*/
package practice.leetcode.Array_String;

public class RemoveDuplicate {
    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {
      /*int k = 0;
        for (int j = 0; j < nums.length; j++) {
            if (j<nums.length-1 && nums[j]==nums[j+1]) {
                continue;
            }
            else {
                nums[k]=nums[j];
                k++;
            }
        }
        return k ;*/
        int k=0;
       for (int i=1; i < nums.length; i++){
           if (nums[k] != nums[i]) {
               k++;
               nums[k]=nums[i];
           }
       }
                return k+1;
    }
}

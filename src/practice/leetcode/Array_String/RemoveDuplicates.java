package practice.leetcode.Array_String;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        for(int ii=0;ii< nums.length;ii++)
        System.out.println(removeDuplicates(nums));


    }
    public static int removeDuplicates(int[] nums) {


        int k = 2; // Counter for unique elements

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k-2]) {
                nums[k] = nums[i];
                k++;

            }
        }

        return k;

    }


}

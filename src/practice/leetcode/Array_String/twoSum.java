/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.*/



package practice.leetcode.Array_String;

public class twoSum
{
    public static void twoSum(int[] nums, int target)
    {
        for(int i=0;i<nums.length; i++) {
            for (int k = i+1; k < nums.length; k++){
                if (nums[i] + nums[k] == target) {
//                    return new int[]{i, k};
                    System.out.println(i + "  " + k);
                }
        }

        }
        //return new int[]{-1, -1};
}

    public static void main(String[] args) {
        int [] nums={2,7,11,15,8,1};
        int target=9;

        twoSum(nums,target);


        //System.out.println(result[0] + "  " + result[1]);
    }
}

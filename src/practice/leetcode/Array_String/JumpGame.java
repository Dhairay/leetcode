/*
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array
represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.
*/


package practice.leetcode.Array_String;

public class JumpGame {

    public static void main(String[] args) {
        int[] nums = {1,1,4,5,6};
        System.out.println(canJump(nums));

    }

    public static boolean canJump(int[] nums) {
        int reach = 0;
        for (int i = 0; i <=reach; i++) {
            reach = Math.max(reach, i + nums[i]);
            if (reach >= i + nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}

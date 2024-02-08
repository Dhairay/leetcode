package practice.leetcode.Sliding_Window;


public class MinimumSizeSubArraySum {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {

        int i = 0;
        int j = 0;
        int sum = 0;
        int minL = Integer.MAX_VALUE;

        while (j < nums.length) {
            sum += nums[j];

            while (sum >= target) {
                minL = Math.min(minL, j - i + 1);

                sum -= nums[i];
                i++;
            }
            j++;
        }
        return minL==Integer.MAX_VALUE ? 0 : minL;
    }
}

package practice.leetcode.Array_String;

public class JumpGame_II {

    public  int jump(int[] nums) {
        int reach = 0;
        int current=0;
        int jumps=0;
        for (int i = 0; i < nums.length-1; i++) {
            reach = Math.max(reach,nums[i]+i);
            if(i==current)
            {
                current=reach;
                jumps++;
            }

        }
      return jumps;
    }
    public static void main(String[] args) {
        int [] nums= {2,3,1,1,4};
        JumpGame_II j = new JumpGame_II();
        System.out.println(j.jump(nums));

    }

}

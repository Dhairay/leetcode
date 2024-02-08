package practice.leetcode.Array_String;


public class RotateArray {
    public static void rorate (int [] nums) {
        int i = 0;
        int j = nums.length-1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        for (int ii = 0; ii < nums.length; ii++) {

            System.out.print(nums[ii]+" ");
        }
    }

    public static void rorateByStep (int [] nums, int num) {
        int length = nums.length;
        int []array = new int[length];
        for(int i=0; i<length; i++){
            array[i] = nums[(length-num+i)%length];
        }
        for (int ii = 0; ii < array.length; ii++) {

            System.out.print(array[ii]+" ");
        }
    }

    public static void main(String[] args) {
        int[] aa = {1,2,3,4,5,6,7,8};
        rorateByStep(aa, 2);

    }
}

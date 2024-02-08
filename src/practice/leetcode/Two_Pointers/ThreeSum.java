package practice.leetcode.Two_Pointers;

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;
import sun.util.resources.ms.CalendarData_ms_MY;

import java.util.*;

import static java.util.Arrays.sort;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
        //  int[][] result = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        /*List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> current = new ArrayList<>();
                        current.add(nums[i]);
                        current.add(nums[j]);
                        current.add(nums[k]);

                        result.add(current);



                    }
                }

            }
        }
        return result;

    }*/

        if (nums == null || nums.length < 3) return new ArrayList<>();

        //Sort the element

        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        //Fix the first element and find the other two element

        for (int i = 0; i < nums.length - 2; i++) {

            //Finding Other two element using two sum approach

            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {

                    //Add the set and move to find other elements

                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0)
                    left++;
                else
                    right--;


            }
        }
return new ArrayList<>(result);
    }

}


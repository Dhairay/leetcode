package practice.leetcode.Two_Pointers;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));
    }

    //Area=Length(min(Right,Left)) * Width(Left-Right)
    public static int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(area, maxArea);
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }
}

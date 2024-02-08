package practice.leetcode.Array_String;

class MergingSortedArray {
    public void merge(int[] nums1, int[] nums2) {
        int m = 0;
        int n = 0;
        int o = 0;
        int[] nums3 = new int[nums1.length + nums2.length];
        while (m < nums1.length && n < nums2.length) {
            if (nums1[m] <= nums2[n]) {
                nums3[o] = nums1[m];
                m++;
            } else {
                nums3[o] = nums2[n];
                n++;
            }
            o++;
        }

        if (m < nums1.length) {
            while (m < nums1.length) {
                nums3[o] = nums1[m];
                m++;
                o++;
            }
        }

        if (n < nums2.length) {
            while (n < nums2.length) {
                nums3[o] = nums2[n];
                n++;
                o++;
            }
        }

        for (int i = 0; i < nums3.length; i++) {
            System.out.println(nums3[i]);
        }
    }

    public static void main(String[] args) {
        MergingSortedArray ms = new MergingSortedArray();

        int[] nums1 = {1, 2, 3, 8, 9};
        int[] nums2 = {1, 2, 5, 6};
        ms.merge(nums1, nums2);

    }

}

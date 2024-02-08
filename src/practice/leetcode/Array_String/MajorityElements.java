package practice.leetcode.Array_String;

class MajorityElement{
    public static int majorityElement(int[] a) {
        int count = 0;
        int element = 0;
        for (int i = 0; i < a.length; i++) {

            if (count == 0) {
                element = a[i];

            }
            if (a[i] == element)
                count += 1;
            else
                count -= 1;


        }
        return element;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 1, 2, 2, 1, 1, 2, 2};

        int result = majorityElement(nums);
        System.out.println(result);

    }
}



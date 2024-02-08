package practice.leetcode.Array_String;

public class Candy {
    public static void main(String[] args) {
        int[] ratings = {1, 0, 2};
        System.out.println(candy(ratings));
    }

    public static int candy(int[] ratings) {
        int n = ratings.length;
        int candy = n; //Each student will get one candy

        int i = 1;
        while (i < n) {
            if (ratings[i] == ratings[i - 1]) {
                i++;
                continue;
            }

            //increasing slope peak
            int peak = 0;
            while (ratings[i] > ratings[i - 1]) {
                peak++;
                candy += peak;
                i++;
                if (i == n)
                    return candy;

            }
            //Decreasing Slope dip
            int dip = 0;
            while (i < n && ratings[i] < ratings[i - 1]) {
                dip++;
                candy += dip;
                i++;
            }
            candy -= Math.min(peak, dip);
        }
        return candy;
    }
}

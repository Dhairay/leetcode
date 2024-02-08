package practice.practice;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Number of test cases
        System.out.println("Enter the Number of test Cases --> ");
        int t = sc.nextInt();
        int[] results = new int[t];
        for (int index = 0; index <= t - 1; index++)
        // Input size of arrays
        {
            System.out.print("Enter the size of arrays: ");
            int n = sc.nextInt();

            // Input array A
            System.out.println("Enter array A: ");
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }

            // Input array B
            System.out.println("Enter array B: ");
            int[] B = new int[n];
            for (int i = 0; i < n; i++) {
                B[i] = sc.nextInt();
            }

            // Create an array of pairs
            int[][] pairs = new int[n][2];
            for (int i = 0; i < n; i++) {
                pairs[i][0] = A[i];
                pairs[i][1] = B[i];

            }

            // Sort the array of pairs based on the first element of each pair
            Arrays.sort(pairs, (x, y) -> Integer.compare(x[0], y[0]));

            // Find the minimum length of the subarray to make A and B the same
            int minSubarrayLength = Integer.MIN_VALUE;
            for (int i = 0; i < n - 1; i++) {
                if (pairs[i][1] >= pairs[i + 1][1]) {
                    minSubarrayLength = Math.max(minSubarrayLength, i + 1);

                }
            }

            results[index] = minSubarrayLength;


        }

        for (int i = 0; i < results.length; i++)
        {
            System.out.println("Minimum : " +results[i]);
        }
    }
}
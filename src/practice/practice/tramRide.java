package practice.practice;
public class tramRide {

    public static int minCost(int N, int start, int finish, int[] ticketCost) {
        int[] dp = new int[N];

        // Initialize the dp array with Integer.MAX_VALUE
        for (int i = 0; i < N; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        // Set the cost of reaching the start station to 0
        dp[start] = 0;

        // Traverse the stations
        for (int i = start; i != finish; i = (i + 1) % N) {
            // Calculate the cost of moving to the next station in both directions
            int nextStation = (i + 1) % N;
            int costClockwise = dp[i] + ticketCost[i];
            int costAntiClockwise = dp[i] + ticketCost[(i + N - 1) % N];

            // Update the dp array with the minimum cost to reach the next station
            dp[nextStation] = Math.min(dp[nextStation], Math.min(costClockwise, costAntiClockwise));
        }

        // The minimum cost to reach the finish station
        return dp[finish];
    }

    public static void main(String[] args) {
        int N = 4;
        int start = 1;
        int finish = 4;
        int[] ticketCost = {1, 2, 2, 4};

        int result = minCost(N, start, finish, ticketCost);
        System.out.println("Minimum cost: " + result);
    }
}

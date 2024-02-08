package practice.leetcode.Array_String;

public class StockBuyAndSell_II {
    public static void main(String[] args) {
        int[] prices = {2, 3, 4, 11, 3, 6, 9};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += (prices[i] - prices[i - 1]);

            }
        }
        return profit;
    }

}


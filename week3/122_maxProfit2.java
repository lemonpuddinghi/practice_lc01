class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        // 0：持有现金
        // 1：持有股票
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0; // hold cash, not buy: do nothing or sell stock
        dp[0][1] = -prices[0]; // hold stock: do nothing or but stock
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]); // sold stock
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]); // buy stock
        }
        return dp[prices.length - 1][0];
    }
}
// Time: O(N)
//Spcae: O(N*2) --> O(N)
class Solution {
    public int maxProfit(int k, int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int[][] buy = new int[][k];
        int[][] sell = new int[][k];

        for (int i = 1; i < prices.length; i++) {
            for (int j = ) {

            }
            buy[i] = Math.max(buy[i-1], -prices[i]);
            sell[i] = Math.max(sell[i-1], );
        }
    }
}
class Solution {
    //at the end of anyday, there are 5 status of operations.
    // 1. do nothing
    // 2. buy
    // 3. buy, sell
    // 4. buy, sell, buy
    // 5. buy, sell, buy, sell
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
//        int[] buy = new int[prices.length];
//        int[] sell = new int[prices.length];
        // 4个状态的最大利润
        int buy1 = -prices[0];
        int buy2 = -prices[0];
        int sell1 = 0;
        int sell2 = 0;

//        for (int i = 1; i < prices.length; i++) {
//            buy[i] = Math.max(buy[i-1], buy[i-1] - prices[i]);
//            sell[i] = Math.max(sell[i-1], sell[i-1] + prices[i]);
//        }
//        return sell[prices.length - 1];
        for (int i = 1; i < prices.length; i++) {
            buy1 = Math.max(buy1, -prices[i]);
            sell1 = Math.max(sell1, buy1 + prices[i]);
            buy2 = Math.max(buy2, sell1 - prices[i]);
            sell2 = Math.max(sell2, buy2 + prices[i]);
        }
        return sell2;
    }
}
// Time: O(N)
// Space: O(1)
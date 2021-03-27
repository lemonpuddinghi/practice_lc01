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
        int[] buy = new int[prices.length];
        int[] sell = new int[prices.length];

        for (int i = 1; i < prices.length; i++) {
            buy[i] = Math.max(buy[i-1], buy[i-1] - prices[i]);
            sell[i] = Math.max(sell[i-1], sell[i-1] + prices[i]);
        }
        return buy[]
    }
}
class Solution {
    public int maxProfit(int[] prices) {

        int minprice = Integer.MAX_VALUE;
        // buy at the min price, sell at the highest price
        // find the min and max value
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else {
                maxprofit = Math.max(maxprofit, prices[i] - minprice);
            }
        }
        return maxprofit;
    }
}

//Time: O(N)
//Space: O(1)
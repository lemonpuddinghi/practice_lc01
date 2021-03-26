class Solution {
    public int coinChange(int[] coins, int amount) {
        // F(i)为组成金额i所需最少的硬币数量。
        // 假设在计算F(i)之前，已经计算出F(0) ~ F(i-1)的答案，则：
        // F(i) = min F(i-cj) + 1, j=0...n-1, cj代表第j枚硬币的面值，枚举最后一枚硬币面额是cj，那么需要从i-cj这个金额的状态F(i-cj)转义过来，再算上枚举的这枚硬币数量1 的贡献。
        int n = amount + 1;
        int[] dp = new int[n];
        Arrays.fill(dp, n);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0) {
                    dp[i] = Math.min(dp[i - coins[j]] + 1, dp[i]);
                }
            }
        }
        return dp[amount] > amount? -1: dp[amount];
    }
}
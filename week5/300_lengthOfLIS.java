class Solution {
    public int lengthOfLIS(int[] nums) {
        // DP+BS
        // To-DO
        int[] dp = new int[nums.length];
        int len = 0;
        for (int num: nums) {
            int i = Arrays.binarySearch(dp, 0, len, num);
            if (i < 0) {
                i = -(i + 1);
            }
            dp[i] = num;
            if (i == len) {
                len++;
            }
        }
        return len;
        // Time:O(nlogn)
        // Space: O(n)
    }
    public int lengthOfLIS1(int[] nums) {
        // DP1
        if (nums == null) {
            return 0;
        }
        if (nums.length <= 1) {
            return 1;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxres = 0;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxres = Math.max(dp[i], maxres);
        }
        return maxres;
    }
    // Time: O(N^2)
    // Space: O(N)

}
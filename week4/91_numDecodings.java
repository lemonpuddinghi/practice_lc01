class Solution {
    public int numDecodings1(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0'? 0: 1;

        for (int i = 2; i < dp.length; i++) {
            if (s.charAt(i - 1) != '0') {
                dp[i] = dp[i - 1];
            }
            int twoDigit = Integer.valueOf(s.substring(i - 2, i));
            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[s.length()];
        // Time: O(N)
        // Space: O(N)
    }

    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }
        int prepre = 1;
        int pre = 1;

        for (int i = 1; i < s.length(); i++) {
            int cur = 0;
            if (s.charAt(i) != '0') {
                cur = pre;
            }
            int twoDigit = Integer.parseInt(s.substring(i-1, i+1));
            if (twoDigit >= 10 && twoDigit <= 26) {
                cur = cur + prepre;
            }
            prepre = pre;
            pre = cur;
        }
        return pre;
    }
    // Time: O(N)
    // Spcae: O(1)

}

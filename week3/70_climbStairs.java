class Solution {
    public int climbStairs(int n) {
        // int[] record = new int[n+1];
        // record[i]: there are record[i] ways to the ith stair
        // init:
        // record[0] = 0;
        // record[1] = 1; // step 1
        // record[2] = 2; // 1+1, 0+2
        // record[3] = record[1] + record[2]; // = 3
        // optimize: using variable to store the ways.
        // Time: O(N)
        // Space: O(1)
        if (n <= 2) {
            return n;
        }
        int prepre = 1;
        int pre = 2;
        int cur = 0;
        for (int i = 3; i <= n; i++) {
            cur = prepre + pre;
            prepre = pre;
            pre = cur;
        }
        return cur;

    }
}
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int[] f = new int[nums.length+1];
        f[0] = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            f[i] = Math.max(nums[i], nums[i] + f[i-1]);
            maxSum = Math.max(f[i], maxSum);
        }
        return maxSum;
    }
}
class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int maxRes = nums[0];
        int minRes = nums[0];
        int res = maxRes;
        for (int i = 1; i < nums.length; i++) {
            int tempMax = Math.max(nums[i], Math.max(minRes * nums[i], maxRes * nums[i]));
            minRes = Math.min(nums[i], Math.min(maxRes * nums[i], minRes * nums[i]));
            maxRes = tempMax;
            res = Math.max(res, maxRes);
        }
        return res;
    }
}
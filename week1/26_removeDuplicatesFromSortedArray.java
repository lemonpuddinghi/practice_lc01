class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums.length;
        }
        // use two pointers: left, right
        // [0, left) Done [right, n) unprocessed, [left, right) dont care
        int left = 0;
        int right = 1;
        while (right < nums.length) {
            if (nums[left] == nums[right]) {
                right++;
                continue;
            } else {
                nums[++left] = nums[right];
                right++;
            }
        }
        return left+1;
    }
}

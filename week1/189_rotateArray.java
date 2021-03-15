class Solution {
    public void rotate(int[] nums, int k) {
        // 2 step: 1234567 k=3
        // 7654321
        // 765 4321
        // 567 1234
        k = k % (nums.length);
        reverseArray(nums, 0, nums.length - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, nums.length - 1);
    }
    private void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end--;
            start++;
        }
    }
}
// Time: O(N)
// Space: O(1)

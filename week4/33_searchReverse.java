class Solution {
    public int search(int[] nums, int target) {
        if (nuns == null || nums.length < 1) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
//            else if (nums[mid] < target) {
//                // target may in right part, or may be in left part
//                // if (nums[left] < nums[right]]): increasing subarray
//                // if nums[left] > nums[right]: increase, reverse point, increase
//
//            }
            if (nums[0] <= nums[mid]) {
                if (nums[0] < target && target < nums[mid]) {
                    right = mid;
                }
                else if (nums[mid]) {

                }
            }
        }
    }
}
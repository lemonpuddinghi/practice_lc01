class Solution {
    //S1: use hashmap to store {num: count}, return the element has the largest count.
    // Time: O(n), Space: O(N)
    //S2: Sort, return nums[n/2] Time: O(nlogn), Space: O(1) or O(n)
    //S3: Moor voting algorith
    //S4: Divide and conquer  Time: O(nlogn) Space: O(logn)
    public int majorityElement2(int[] nums) {
        //S2 sort
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int majorityElement(int[] nums) {
        int candinate = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candinate) {
                count++;
            }
            else {
                if (--count == 0) {
                    candinate = nums[i];
                    count = 1;
                }
            }
        }
        return candinate;
    }

    public int majorityElement4(int[] nums) {
        // S4: divide and conquer
        return helper(nums, 0, nums.length - 1);
    }

    private int helper(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }
        int mid = left + (right - left) / 2;
        int leftMajority = helper(nums, left, mid);
        int rightMajority = helper(nums, mid + 1, right);
        if (leftMajority == rightMajority) {
            return leftMajority;
        }
        return countMajority(nums, leftMajority, left, mid) > countMajority(nums, rightMajority, mid + 1, right) ? leftMajority : rightMajority;
    }

    private int countMajority(int[] nums, int n, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (nums[i] == n) {
                count++;
            }
        }
        return count;
    }
}
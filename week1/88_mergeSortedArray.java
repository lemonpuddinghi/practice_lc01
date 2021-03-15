class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // t3 pointers, start from the end
        int cur = m + n - 1;
        int p1 = m - 1;
        int p2 = n - 1;

        while (cur >= 0 && p2 >= 0 && p1 >= 0) {
            if (nums1[p1] < nums2[p2]) {
                nums1[cur] = nums2[p2--];
            } else {
                nums1[cur] = nums1[p1--];
            }
            cur--;
        }
        // add missing elements from nums2
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}
// Time: O(M+N)
// Space: O(N)

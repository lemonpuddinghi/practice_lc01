class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // S1: HashMap, put nums1 in {num: count}, traverse nums2 and find element in map : Time: O(m+n), Space: O(n)
        // S2: Sorted two array, use two pointers, Time:O(nlogn) space: O(n)
        // S3: Firstly, Sort two arrays, move and swap intersect element to front, use 3 pointers
        if (nums1 == null || nums2 == null) {
            return new int[]{};
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int cur = 0;
        int p1 = 0;
        int p2 = 0;
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] == nums2[p2]) {
                int temp = nums2[p2];
                nums1[cur++] = nums2[p2++];
                p1++;
            } else if (nums1[p1] < nums2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, cur);
    }
}
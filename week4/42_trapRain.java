class Solution {
//    public int trap(int[] height) {
//        if (height == null || height.length < 2) {
//            return 0;
//        }
//        int left = 0;
//        int right = height.length - 1;
//        int res = 0;
//        while (left < right) {
//
//            int area = Math.abs(height[left] - height[right]) * (right - left);
//            res = Math.max(res, area);
//            if (height[left] > height[right]) {
//                right--;
//            } else {
//                left++;
//            }
//        }
//        return res;
//
//    }
    public int trap(int[] height) {
        int[] dp = new int[height.length];

    }
}
class Solution {
    public boolean isPowerOfTwo(int n) {
        // if a number is power of 2, will will contains only one 1
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
// Time: O(1)
// Space: O(1)
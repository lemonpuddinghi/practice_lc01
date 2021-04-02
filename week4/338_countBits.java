//https://leetcode-cn.com/problems/counting-bits/solution/bi-te-wei-ji-shu-by-leetcode-solution-0t1i/
class Solution {
    public int[] countBits1(int num) {
        int[] bits = new int[nums+1];
        int highBit = 0;
        for (int i = 1; i <= num; i++) {
            if ((i & (i -1) == 0)) {
                highBit = i;
            }
            bits[i] = bits[i - highBit] + 1;
        }
        return bits;
    }
    // Time: O(num)
    // Space: O(1)
    public int[] countBits(int num) {
        int[] bits = new int[nums+1];
        for (int i = 1; i <= num; i++) {
            bits[i] = bit[i >> 1] + (i & 1);
        }
        return bits;
    }
}
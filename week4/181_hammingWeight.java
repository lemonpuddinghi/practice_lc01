public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= n - 1;
            count++;
        }
        return count;
    }
    public int hammingWeight_Error(int n) {
        int count = 0;
        while (n != 0) {
            // while (n >0): n is an unsigned value, if n is negative, it will return 0
            // while (n != 0): if n is negative, >>  will time Exceeded: the most significant bit will always be 1
            if ( (n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
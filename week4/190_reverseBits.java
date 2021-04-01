public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        int power = 31;
        while (n != 0) {
            res = res << power | n & 1;
            n = n >> 1;
            power--;
        }
        return res;
    }
//    Time: O(N)
//    Space: O(1)
}
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        for (int i=0; i<32; i++) {
            int msb = n & 1;
            n >>= 1;
            res <<= 1;
            res |= msb;
        }
        return res;
    }
}

/* 
Performance: 
Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse Bits.
Memory Usage: 29.7 MB, less than 7.32% of Java online submissions for Reverse Bits.
*/
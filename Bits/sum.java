class Solution {
    public int getSum(int a, int b) {
        if(b == 0)
            return a;
        else
            return getSum(a^b, (a & b) << 1);
    }
}

/* Performance:
Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum of Two Integers.
Memory Usage: 32.9 MB, less than 6.67% of Java online submissions for Sum of Two Integers.
*/
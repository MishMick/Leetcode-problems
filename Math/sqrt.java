// Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

class Solution {
    public int mySqrt(int x) {
        long indx = 1;
        while((indx*indx)<=x){
            indx++;
        }
        return (int)(indx-1);
    }
}

/*
Performance:
Runtime: 11 ms, faster than 11.76% of Java online submissions for Sqrt(x).
Memory Usage: 33.4 MB, less than 5.00% of Java online submissions for Sqrt(x).
*/
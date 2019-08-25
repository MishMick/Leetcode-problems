// Given an integer, write a function to determine if it is a power of three.

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 0) return false;
        if(n == 1) return true;
        else if(n%3 == 0)
            return isPowerOfThree(n/3);
        else 
            return false;
    }
}

/*
Performance :
Runtime: 11 ms, faster than 75.57% of Java online submissions for Power of Three.
Memory Usage: 36.6 MB, less than 6.25% of Java online submissions for Power of Three.
*/
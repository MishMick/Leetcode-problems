class Solution {
    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
    }
}

/*
Performance: 
Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse String.
Memory Usage: 45.2 MB, less than 97.04% of Java online submissions for Reverse String.
*/
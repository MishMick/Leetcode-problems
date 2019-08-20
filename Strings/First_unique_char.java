//Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

class Solution {
    public int firstUniqChar(String s) {
        int[] chMap = new int[26];
        for (char ch : s.toCharArray()) {
            chMap[(int) ch - 97] += 1;
        }
        for (char ch : s.toCharArray()) {
            if (chMap[(int) ch - 97] == 1)
                return s.indexOf(ch);
        }
        return -1;
    }
}

/*
Performance
Runtime: 5 ms, faster than 97.40% of Java online submissions for First Unique Character in a String.
Memory Usage: 37.9 MB, less than 99.29% of Java online submissions for First Unique Character in a String.
*/
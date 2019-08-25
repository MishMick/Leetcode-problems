//Given a column title as appear in an Excel sheet, return its corresponding column number.

class Solution {
    public int titleToNumber(String s) {
        int num = 0;
        for (int i=0;i<s.length();i++){
            num = ((int)s.charAt(i) - 64) + num *26;
        }
        return num;
    }
}

/*
Performance :
Runtime: 1 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Number.
Memory Usage: 35.7 MB, less than 100.00% of Java online submissions for Excel Sheet Column Number.
*/
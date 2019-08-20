//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longestCommonPrefix = "";
        if(strs == null || strs.length == 0)
            return longestCommonPrefix;
        int index = 0;
        for(char c: strs[0].toCharArray()){
            for(int i=1;i<strs.length;i++){
                if(index >= strs[i].length() || c != strs[i].charAt(index)){
                    return longestCommonPrefix;
                }
            }
            longestCommonPrefix += c;
            index++;
        }
        return longestCommonPrefix;
    }
}

/*
Performance:
Runtime: 1 ms, faster than 74.17% of Java online submissions for Longest Common Prefix.
Memory Usage: 37.6 MB, less than 83.04% of Java online submissions for Longest Common Prefix.
*/
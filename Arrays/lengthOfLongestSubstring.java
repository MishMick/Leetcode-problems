class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] map = new int[128];
        int start = 0, end = 0, maxLen = 0, counter = 0;
        while(end < s.length()){
            final char c1 = s.charAt(end);
            if(map[c1] > 0)
                counter ++;
            map[c1]++;
            end++;
            
            while(counter > 0){
                final char c2 = s.charAt(start);
                if(map[c2] > 1)
                    counter--;
                map[c2]--;
                start++;
            }
            
            maxLen = Math.max(maxLen, end - start);
        }
        return maxLen;
    }
}

/* Performance: 
Runtime: 3 ms, faster than 91.44% of Java online submissions for Longest Substring Without Repeating Characters.
Memory Usage: 36.9 MB, less than 99.76% of Java online submissions for Longest Substring Without Repeating Characters.
*/
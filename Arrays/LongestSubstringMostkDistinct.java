class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int start = 0, end = 0, maxLen = 0, counter = 0;
        int[] map = new int[256];
        
        while(end < s.length()){
            final char c1 = s.charAt(end);
            if(map[c1] == 0)
                counter++;
            map[c1]++;
            end++;
            
            while(counter > k){
                final char c2 = s.charAt(start);
                if(map[c2] == 1)
                    counter--;
                map[c2]--;
                start++;
            }
            
            maxLen = Math.max(maxLen, (end - start));
        }
        return maxLen;
    }
}

/* Performance: 
Runtime: 2 ms, faster than 99.72% of Java online submissions for Longest Substring with At Most K Distinct Characters.
Memory Usage: 38.1 MB, less than 68.08% of Java online submissions for Longest Substring with At Most K Distinct Characters.
*/
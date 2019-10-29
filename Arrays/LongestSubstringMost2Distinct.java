class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int start = 0, end = 0, maxLen = 0, counter = 0;
        int[] map = new int[256];
        
        while(end < s.length()){
            final char c1 = s.charAt(end);
            if(map[c1] == 0)
                counter++;
            map[c1]++;
            end++;
            
            while(counter > 2){
                System.out.println("Start decrementing here");
                final char c2 = s.charAt(start);
                System.out.println("New start: "+start);
                if(map[c2] == 1)
                    counter--;
                map[c2]--;
                start++;
            }
            System.out.println("Updated start and end here: "+start+", "+end);
            maxLen = Math.max(maxLen, (end-start));
        }
        return maxLen;
    }
}

/* Performance: 
Runtime: 381 ms, faster than 5.14% of Java online submissions for Longest Substring with At Most Two Distinct Characters.
Memory Usage: 36.9 MB, less than 100.00% of Java online submissions for Longest Substring with At Most Two Distinct Characters.
*/
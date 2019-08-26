// Given two strings s and t , write a function to determine if t is an anagram of s.

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> sMap = new HashMap<Character,Integer>(); 
        HashMap<Character,Integer> tMap = new HashMap<Character,Integer>(); 
        if(s.length() != t.length()) return false;
       	for (int i = 0, j = t.length()-1; i < s.length() && j >= 0; i++, j--) {
            sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i), 0)+1);
            tMap.put(t.charAt(j),tMap.getOrDefault(t.charAt(j), 0)+1);
		}
        if(sMap.equals(tMap)) return true;
        else return false;
        
    }
}

/* Performance :
Runtime: 22 ms, faster than 13.98% of Java online submissions for Valid Anagram.
Memory Usage: 38.1 MB, less than 63.87% of Java online submissions for Valid Anagram.
*/
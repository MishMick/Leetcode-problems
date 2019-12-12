class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().split("[ !?',;.]+");
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : words) map.put(word, map.getOrDefault(word, 0) + 1);
        for(String word : banned) if(map.containsKey(word)) map.remove(word);
        String result = null;
        for(String word: map.keySet()){
            if(result == null || map.get(word) > map.get(result))
                result = word;
        }
        return result;
    }
}

/* Performance:
Runtime: 17 ms, faster than 49.64% of Java online submissions for Most Common Word.
Memory Usage: 36.2 MB, less than 95.96% of Java online submissions for Most Common Word.
*/
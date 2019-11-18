class Solution {
   
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String current : strs){
            char[] chArr = current.toCharArray();
            Arrays.sort(chArr);
            String sorted = new String(chArr);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(current);
        }
        result.addAll(map.values());
        return result;
    }
}

/* Performance :
Runtime: 8 ms, faster than 97.18% of Java online submissions for Group Anagrams.
Memory Usage: 42.6 MB, less than 85.96% of Java online submissions for Group Anagrams.
*/
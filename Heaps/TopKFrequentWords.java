import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> frequentWords = new ArrayList<>();
        
        HashMap<String, Integer> map = new HashMap<>();
        for(String word: words){
            map.put(word, map.getOrDefault(word,0)+1);
        }
       
        PriorityQueue<Map.Entry<String, Integer>> heap = new PriorityQueue<>(
                 (a,b) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue()
        );
        
        for(Map.Entry<String, Integer> entry: map.entrySet())
        {
            heap.add(entry);
            if(heap.size()>k)
                heap.poll();
        }
        
        while(!heap.isEmpty())
            frequentWords.add(0,heap.poll().getKey());
        
        return frequentWords;
    }
}
/*
Runtime: 6 ms, faster than 95.73% of Java online submissions for Top K Frequent Words.
Memory Usage: 39.2 MB, less than 67.86% of Java online submissions for Top K Frequent Words.
*/
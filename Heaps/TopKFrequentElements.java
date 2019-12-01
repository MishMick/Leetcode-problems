import java.util.*;

class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x: nums){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a,b) -> ( b.getValue() - a.getValue() ));
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            heap.add(entry);
        }
    
        for(int i=0;i<k;i++){
            result.add(heap.poll().getKey());
        }

        return result;
    }
}

/* Performance: 
Runtime: 12 ms, faster than 79.84% of Java online submissions for Top K Frequent Elements.
Memory Usage: 40.5 MB, less than 68.10% of Java online submissions for Top K Frequent Elements.
*/
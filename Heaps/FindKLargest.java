import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int result = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>(nums.length, (a,b) -> (b-a));
        for(int n: nums){
            heap.add(n);
        }
        
        for(int i=0;i<k;i++){
            result = heap.poll();
        }
        return result;
    }
}

/*
Runtime: 7 ms, faster than 53.68% of Java online submissions for Kth Largest Element in an Array.
Memory Usage: 36.4 MB, less than 90.67% of Java online submissions for Kth Largest Element in an Array.
*/
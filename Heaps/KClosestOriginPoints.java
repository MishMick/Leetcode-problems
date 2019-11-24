import java.util.*;

class Solution {
    public int[][] kClosest(int[][] points, int K) {
        /* Pseudocode
        
        Create a min heap with a comparator
        compare given point's distance to origin, push to priorityqueue
        poll k times 
        return items
        
        */
        
        PriorityQueue<int[]> heap=new PriorityQueue<int[]>(points.length, (a,b) -> 
                (int)( (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1]) ));

   
        for(int[] point: points){
            heap.add(point);
        }
        
        int[][] result = new int[K][2];

        for(int i=0;i<K;i++){
            result[i] = heap.poll();
        }
       
        return result;
    }
}

/* Performance: 
Runtime: 19 ms, faster than 70.51% of Java online submissions for K Closest Points to Origin.
Memory Usage: 59.5 MB, less than 76.40% of Java online submissions for K Closest Points to Origin.
*/
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        Map<Integer, List<Integer>> adj = new HashMap<>();
        int[] indegree = new int[numCourses];
        
        for(int[] pre: prerequisites){
            List<Integer> list = adj.getOrDefault(pre[1], new ArrayList<>());
            list.add(pre[0]);
            indegree[pre[0]]++;
            adj.put(pre[1],list);
        }
        
        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i] == 0)
                q.add(i);
        }
        
        while(!q.isEmpty()){
            int curr = q.poll();
            if(indegree[curr] == 0)
                count++;
            if(!adj.containsKey(curr))
                continue;
            for(int nei: adj.get(curr)){
                indegree[nei]--;
                if(indegree[nei] == 0)
                    q.add(nei);
            }
        }
        
        return count == numCourses;
    }
}

/* Performance: 
Runtime: 6 ms, faster than 62.75% of Java online submissions for Course Schedule.
Memory Usage: 44.1 MB, less than 96.92% of Java online submissions for Course Schedule.
*/

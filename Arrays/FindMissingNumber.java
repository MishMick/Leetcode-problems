class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {        
        // Create hashmap for numbers
        // iterate hashmap 
        // if value = 0 for a key
        // append key to list
     
        int[] arr = new int[nums.length + 1];
        for(int i=0;i< nums.length; i++) 
            arr[nums[i]] = 1;
        
        List<Integer> numList = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) if (arr[j] == 0 && j!=0) numList.add(j);
        
        return numList;
    }
    
}

/* 
performance: 
Runtime: 4 ms, faster than 99.99% of Java online submissions for Find All Numbers Disappeared in an Array.
Memory Usage: 46.9 MB, less than 94.34% of Java online submissions for Find All Numbers Disappeared in an Array.
*/
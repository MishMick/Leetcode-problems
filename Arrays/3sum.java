class Solution {
 
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i > 0 && (nums[i] == nums[i-1])) continue; // avoid duplicate
            for(int j=i+1,k = nums.length-1; j<k;){
                if(nums[i]+nums[j]+nums[k] == 0){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while((j < k) && (nums[j] == nums[j-1]))j++;// avoid duplicates
                    while((j < k) && (nums[k] == nums[k+1]))k--;// avoid duplicates
                }else if(nums[i]+nums[j]+nums[k] < 0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return result;
    }
}

/* Performance: 
Runtime: 32 ms, faster than 65.51% of Java online submissions for 3Sum.
Memory Usage: 47.4 MB, less than 86.92% of Java online submissions for 3Sum.
*/
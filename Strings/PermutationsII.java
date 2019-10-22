import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> sets = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums, int l, int r){
        if(l == r)
        {
            List<Integer> intList = new ArrayList<Integer>(nums.length);
            for (int i : nums){
                intList.add(i);  
            }
            if(!sets.contains(intList))
                sets.add(intList);
        }else{
            for(int i=l;i<=r;i++){
                nums = swap(nums,l,i);
                permute(nums,l+1,r);
                nums = swap(nums,l,i);
            }
        }
        return sets;
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        return permute(nums,0, nums.length-1);
    }
    public int[] swap(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
        return nums;
    }
}

/* PerformancE: 
Runtime: 250 ms, faster than 5.02% of Java online submissions for Permutations II.
Memory Usage: 38.1 MB, less than 98.51% of Java online submissions for Permutations II.
*/
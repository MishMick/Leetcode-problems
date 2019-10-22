import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int N = nums.length;
        List<List<Integer>> subsets = new ArrayList<>();
        for(int i = 0;i < (1 << N); i++)
        {
            List<Integer> subset = new ArrayList<>();

            for(int j=0;j < N; ++j)
            {
                if (((1 << j) & i) != 0){
                    System.out.print(nums[j]+"\t");
                    subset.add(nums[j]);
                }
            }
            Collections.sort(subset);
            subsets.add(subset);
            System.out.println("");
        }
        return subsets;
    }
}

/* Performance: 
Runtime: 15 ms, faster than 5.21% of Java online submissions for Subsets.
Memory Usage: 36.9 MB, less than 99.18% of Java online submissions for Subsets.
*/
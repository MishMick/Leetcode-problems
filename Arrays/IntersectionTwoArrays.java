class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] ans = new int[Math.max(nums1.length, nums2.length)];

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int k = 0;
        
        if(nums1.length == 0 || nums2.length == 0) return new int[0];

        while(i <= nums1.length || j <= nums2.length){
            if(i == nums1.length || j == nums2.length) 
                break;
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums2[j] < nums1[i]){
                j++;
            }
            else{
                ans[k] = nums1[i];
                k++;
                i++;
                j++;
            }
        }
        int[] res = new int[k];
        for(int m = 0; m < k; m++)
            res[m] = ans[m];
        return res;
    }
}

/* Performance: 
Runtime: 1 ms, faster than 100.00% of Java online submissions for Intersection of Two Arrays II.
Memory Usage: 37.9 MB, less than 41.94% of Java online submissions for Intersection of Two Arrays II.
*/
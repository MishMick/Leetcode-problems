/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */

 // Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

var merge = function(nums1, m, nums2, n) {
    for(i=0;i<n;i++){
        nums1.splice(m+i,1,nums2[i]);
    }
    return nums1.sort((a, b) => a - b);
};

/* Elegant solution: 
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m, j = 0; i < m+n && j < n; i++, j++)
            nums1[i] = nums2[j];
        Arrays.sort(nums1);        
    }
}
*/

/* Performance 
*   Runtime: 52 ms, faster than 88.63% of JavaScript online submissions for Merge Sorted Array.
*   Memory Usage: 35.1 MB, less than 7.92% of JavaScript online submissions for Merge Sorted Array.
*/
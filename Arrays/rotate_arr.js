//Given an array, rotate the array to the right by k steps, where k is non-negative.

/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    indx=1;
    if(nums.length > 1 && k>0){
      do{
        temp=nums[0];
        nums[0]=nums[nums.length-1];
        for(j=1;j<nums.length-1;j++){
            nums[nums.length-j]=nums[nums.length-(j+1)];
        }
        nums[1]=temp;
        indx++;
      }while(indx<=k)
    }
};

//Performance:
/**
* Runtime: 620 ms, faster than 5.63% of JavaScript online submissions for Rotate Array.
* Memory Usage: 35.2 MB, less than 81.13% of JavaScript online submissions for Rotate Array.
*/

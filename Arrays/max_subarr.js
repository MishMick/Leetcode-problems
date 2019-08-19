/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    var overall_sum = 0;
    var largest_num = nums[0];
    for(i=0;i<nums.length;i++){
        overall_sum += nums[i];
        if(overall_sum > largest_num){
            largest_num = overall_sum;
        }
        if(overall_sum <= 0){
            overall_sum = 0;
        }
    }
    return largest_num;
};


/*
* Performace:
* Runtime: 56 ms, faster than 84.03% of JavaScript online submissions for Maximum Subarray.
* Memory Usage: 35.2 MB, less than 75.93% of JavaScript online submissions for Maximum Subarray.
*/
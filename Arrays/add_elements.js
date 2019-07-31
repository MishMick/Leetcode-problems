//Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    counter = 0;
    let sum = _.sum(nums);
    for(i=0;i<=nums.length;i++){
        counter += i;
    }
    return (counter-sum);
};

/*
*Runtime: 56 ms, faster than 91.18% of JavaScript online submissions for Missing Number.
*Memory Usage: 35.9 MB, less than 89.50% of JavaScript online submissions for Missing Number.
*/

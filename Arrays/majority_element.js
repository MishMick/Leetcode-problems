//Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

// You may assume that the array is non-empty and the majority element always exist in the array.

/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    var counter = _.countBy(nums);
    var maxKey = Object.keys(counter).reduce((a, b) => counter[a] > counter[b] ? a : b);
    return maxKey
};

/**
* Performance
* Runtime: 64 ms, faster than 69.66% of JavaScript online submissions for Majority Element.
* Memory Usage: 37.2 MB, less than 88.32% of JavaScript online submissions for Majority Element.
**/

//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
     counter=0;
     _.find(nums, function(n) {
       if(n === 0){
           counter++;
       }
    });
    _.remove(nums, function(n) {
        return n === 0;
    });
    for(i=0;i<counter;i++){
        nums.push(0);
    }
}

//Performance:
/**
* Runtime: 76 ms, faster than 20.26% of JavaScript online submissions for Move Zeroes.
* Memory Usage: 36.4 MB, less than 10.25% of JavaScript online submissions for Move Zeroes.
*/

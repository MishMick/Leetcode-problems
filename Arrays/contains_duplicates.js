//Given an array of integers, find if the array contains any duplicates.
//Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums) if(!set.add(i)) return true;
            return false;
        }
}

/**
* Runtime: 6 ms, faster than 80.56% of Java online submissions for Contains Duplicate.
* Memory Usage: 45.3 MB, less than 5.06% of Java online submissions for Contains Duplicate.
**/

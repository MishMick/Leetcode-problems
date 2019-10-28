/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            // iterate 0...n
            // perform binary search to check if version = false
            // if version(x) = false -> iterate higher versions
            // if version(x) = true -> iterate lower versions until version(x) == false
            int start = 1;
            int end = n;
            while(start < end){
                int mid = start + (end - start)/2;
    
                if(isBadVersion(mid))
                    end =  mid;
                else 
                    start = mid+1;
            }
            return start;
        }
    }

/* Performance: 
Runtime: 10 ms, faster than 99.73% of Java online submissions for First Bad Version.
Memory Usage: 33.1 MB, less than 100.00% of Java online submissions for First Bad Version.
*/
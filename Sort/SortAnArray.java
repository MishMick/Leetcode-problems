class Solution {
    public int[] mergeSort(int[] input){
        if(input.length <= 1)
            return input;
        
        int pivot = input.length / 2;
        
        int[] left_arr = mergeSort(Arrays.copyOfRange(input, 0, pivot));
        int[] right_arr = mergeSort(Arrays.copyOfRange(input, pivot, input.length));
        
        return merge(left_arr, right_arr);
    }
    
    public int[] merge(int[] left_list, int[] right_list){
        int[] ret_list = new int[left_list.length + right_list.length];
        
        int left_cursor = 0;
        int right_cursor = 0;
        int ret_cursor = 0;
        
        while(left_cursor < left_list.length && right_cursor < right_list.length){
            if(left_list[left_cursor] < right_list[right_cursor]){
                ret_list[ret_cursor++] = left_list[left_cursor++];
            }else{
                ret_list[ret_cursor++] = right_list[right_cursor++];
            }
        }
        
        //while still elements left
        while(left_cursor < left_list.length){
            ret_list[ret_cursor++] = left_list[left_cursor++];
        }
        while(right_cursor < right_list.length){
            ret_list[ret_cursor++] = right_list[right_cursor++];
        }
        
        return ret_list;
    }
    
    public List<Integer> sortArray(int[] nums) {  
        List<Integer> list = Arrays.stream(mergeSort(nums))		// IntStream
									.boxed()  		// Stream<Integer>
									.collect(Collectors.toList());
        

        return list;
    }
}

/* Performance; 
Runtime: 22 ms, faster than 16.72% of Java online submissions for Sort an Array.
Memory Usage: 45.4 MB, less than 57.14% of Java online submissions for Sort an Array.
*/
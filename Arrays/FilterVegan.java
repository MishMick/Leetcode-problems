class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<Integer> result = new ArrayList<>();        
        // Max heap
        PriorityQueue<int[]> heap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if(a[1] > b[1]) {
                    return -1;
                }else if(a[1] < b[1]) {
                    return 1;
                }
                else {
                    if(a[0] > b[0]){
                        return -1;
                    }else{
                        return 1;
                    }
                }
            }
        });
        
        for(int[] restaurant: restaurants){
            if(veganFriendly == 1){
                if(restaurant[2] == 1){
                    if(restaurant[3] <= maxPrice && restaurant[4] <= maxDistance)
                        heap.add(restaurant);
                }
            }else{
                 if(restaurant[3] <= maxPrice && restaurant[4] <= maxDistance)
                        heap.add(restaurant);
            }
        }
        
        while(heap.size() > 0){
                result.add(heap.poll()[0]);
        }
        
        return result;
    }
}

/* Performance: 
Runtime: 6 ms, faster than 100.00% of Java online submissions for Filter Restaurants by Vegan-Friendly, Price and Distance.
Memory Usage: 55.8 MB, less than 100.00% of Java online submissions for Filter Restaurants by Vegan-Friendly, Price and Distance.
*/
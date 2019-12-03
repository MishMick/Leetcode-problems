class LRUCache extends LinkedHashMap<Integer, Integer>{

    private int capacity;
    public LRUCache(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }
    
    public int get(int key) {
        return super.getOrDefault(key,-1);
    }
    
    public void put(int key, int value) {
        super.put(key,value);
    }
    
    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest){
        return size() > capacity;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

/* Performance:
Runtime: 13 ms, faster than 99.89% of Java online submissions for LRU Cache.
Memory Usage: 52.6 MB, less than 84.05% of Java online submissions for LRU Cache.
*/
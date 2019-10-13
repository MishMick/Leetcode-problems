class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> list = Arrays.stream(digits).boxed().collect(Collectors.toList());
        int n = list.size() - 1;
        list.set(n, list.get(n) + 1);
        for (int i = n; i > 0 && list.get(i) == 10; --i) {
            list.set(i,0);
            list.set(i-1,list.get(i-1)+1);
        }
        if(list.get(0) == 10){
            list.set(0,0);
            list.add(0,1);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}

/* Performance: 
Runtime: 38 ms, faster than 9.98% of Java online submissions for Plus One.
Memory Usage: 36.1 MB, less than 97.58% of Java online submissions for Plus One.
*/
class Solution {
    
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int steps = 1;
        HashSet<String> set = new HashSet<>();
        for(String word: wordList){
            set.add(word);
        }
        if(!set.contains(endWord))
            return 0;
        
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        while(!q.isEmpty()){
            int size = q.size();
            for(int x=0;x<size;x++){
                String current_word = q.poll();
                char[] word_chars = current_word.toCharArray();
                for(int i=0;i<word_chars.length;i++){
                    char originalChar = word_chars[i];
                    for(char c='a';c<'z';c++){
                        if(word_chars[i] == c) continue;
                        word_chars[i] = c;
                        String new_word = String.valueOf(word_chars);
                        if(new_word.equals(endWord)) return steps+1;
                        if(set.contains(new_word)){
                            q.offer(new_word);
                            set.remove(new_word);
                        }
                    }
                    word_chars[i] = originalChar;
                }
            }
            steps++;
        }
        return 0;
    }
}

/* Performance: 
Runtime: 60 ms, faster than 54.02% of Java online submissions for Word Ladder.
Memory Usage: 40.2 MB, less than 77.37% of Java online submissions for Word Ladder.
*/

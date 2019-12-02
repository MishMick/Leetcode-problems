class TrieNode {
	private TrieNode[] links;		// links to children
	private final int R = 26;		// no. of links per node
	private boolean isEnd;			// is it the end of the word
	
	public TrieNode(){
		links = new TrieNode[R];
	}
	
	public boolean containsKey(char ch){
		return links[ch-'a'] != null;
	}
	
	public TrieNode get(char ch){
		return links[ch-'a'];
	}
	
	public void put(char ch, TrieNode node){
		links[ch-'a'] = node;
	}
	
	public void setEnd(){
		isEnd = true;
	}
	
	public boolean isEnd(){
		return isEnd;
	}
}

class Trie{
	private TrieNode root;
	
	public Trie(){
		root = new TrieNode();
	}
	
	public void insert(String word){
		TrieNode current = root;
		for(int i=0;i<word.length();i++){
			char ch = word.charAt(i);
			if(!current.containsKey(ch))
				current.put(ch, new TrieNode());
			current = current.get(ch);
		}
		current.setEnd();
	}
	
	private TrieNode searchPrefix(String word){
		TrieNode node = root;
		for(int i=0;i<word.length();i++){
			char ch = word.charAt(i);
			if(node.containsKey(ch))
				node = node.get(ch);
			else
				return null;
		}
		return node;
	}
	
	public boolean startsWith(String prefix) {
		TrieNode node = searchPrefix(prefix);
		return node != null;
	}
	
	public boolean search(String word){
		TrieNode node = searchPrefix(word);
		return node != null && node.isEnd();
	}
}

/* Performance: 
Runtime: 34 ms, faster than 91.03% of Java online submissions for Implement Trie (Prefix Tree).
Memory Usage: 50.8 MB, less than 100.00% of Java online submissions for Implement Trie (Prefix Tree).
*/
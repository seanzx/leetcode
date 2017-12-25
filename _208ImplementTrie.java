package leetcode;

public class _208ImplementTrie {
	private class TrieNode{
		TrieNode[] children = new TrieNode[26];;
		boolean isEnd;
		
		public TrieNode() {	
	    }	
	}
	
	TrieNode root;
	public _208ImplementTrie() {
		root = new TrieNode();
	}
	
	public void insert(String word) {
        TrieNode cur = root;
	        for(int i = 0; i < word.length(); i++) {
	        	if(cur.children[word.charAt(i) - 'a'] == null) {
	        		cur.children[word.charAt(i) - 'a'] = new TrieNode();
	        	}
	        	cur = cur.children[word.charAt(i) - 'a'];
	    }
	    cur.isEnd = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode cur = root;
	        for(int i = 0; i < word.length(); i++) {
	        	if(cur.children[word.charAt(i) - 'a'] == null) {
	        		return false;
	        	}
	        	cur = cur.children[word.charAt(i) - 'a'];
	       }
	    return cur.isEnd;   	    
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode cur = root;
	        for(int i = 0; i < prefix.length(); i++) {
	        	if(cur.children[prefix.charAt(i) - 'a'] == null) {
	        		return false;
	        	}
	        cur = cur.children[prefix.charAt(i) - 'a'];
	    }
	    return true;   
    }
	
	public static void main(String[] args) {
		_208ImplementTrie s = new _208ImplementTrie();
		s.insert("add");
		s.search("ad");
		
	}
}

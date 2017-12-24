package leetcode;

import java.util.*;
public class _524LongestWordinDictionarythroughDeleting {
	public String findLongestWord(String s, List<String> d) {
		String res = "";
        for(String word : d) {
        		if(word.length() < res.length()) {
        			continue;
        		}
        		int j = 0;
        		for(int i = 0; i < s.length() && j < word.length(); i++) {
        			if(s.charAt(i) == word.charAt(j)) {
        				j++;
        			}
        		}
        		if(j == word.length()) {
        			if(res.length() == j && res.compareTo(word) > 0) {
        				res = word;
        			}else if(res.length() < j) {
        				res = word;
        			}
        		}
        }
		return res;
    }
	
	public static void main(String[] args) {
		_524LongestWordinDictionarythroughDeleting s = new _524LongestWordinDictionarythroughDeleting();
		List<String> d = new ArrayList<>();
		d.add("ba");
		d.add("ab");
		d.add("a");
		s.findLongestWord("bab", d);
	}
}

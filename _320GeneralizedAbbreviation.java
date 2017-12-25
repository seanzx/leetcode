package leetcode;
import java.util.*;
public class _320GeneralizedAbbreviation {
	List<String> res = new ArrayList<String>();
	public List<String> generateAbbreviations(String word) {
        
		DFS(word, new StringBuilder(), 0, 0);
        return res;
    }
	
	public void DFS(String word, StringBuilder cur, int num, int i){
		StringBuilder copy = new StringBuilder();
		copy.append(cur);
		if(i == word.length()) {
			if(num != 0) {
				copy.append(String.valueOf(num));
			}
			res.add(copy.toString());
			return ;
		}
		
		DFS(word, copy, num+1, i+1);
		if(num == 0) {
			DFS(word, copy.append(word.charAt(i)), 0, i+1);
		}else {
			copy.append(String.valueOf(num));
			copy.append(word.charAt(i));
			DFS(word, copy, 0, i+1);
		}
	}
	
	public static void main(String[] args) {
		_320GeneralizedAbbreviation s = new _320GeneralizedAbbreviation();
		s.generateAbbreviations("word");
	}
}

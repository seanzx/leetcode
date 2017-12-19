package leetcode;
import java.util.*;
public class _290WordPattern {
	public boolean wordPattern(String pattern, String str) {
		Map<Character, String> match = new HashMap<>();
		Set<String> match2 = new HashSet<>();
		String[] st = str.split(" "); 
		if(st.length != pattern.length()) {
			return false;
		}
		for(int i = 0; i < pattern.length(); i++) {
			if(!match.containsKey(pattern.charAt(i))) {
				if(match2.contains(st[i])) {
					return false;
				}else {
					match2.add(st[i]);
					match.put(pattern.charAt(i), st[i]);
				}
			}else {
				if(!match.get(pattern.charAt(i)).equals(st[i])) {
					return false;
				}
			}
		}
		return true;
    }
}

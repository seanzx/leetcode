package leetcode;
public class _316RemoveDuplicateLetters {
	public String removeDuplicateLetters(String s) {

       int[] cnt = new int[26];
       int pos = 0;
       for(int i = 0; i < s.length(); i++) {
    	   		cnt[s.charAt(i) - 'a']++;
       }
       for(int i =0; i < s.length(); i++) {
    	   		if(s.charAt(i) < s.charAt(pos)) 
    	   			pos = i;
    	   		if(--cnt[s.charAt(i) - 'a'] == 0) {
    	   			break;
    	   		}
       }
       return s.length() == 0 ? "" : s.charAt(pos) + removeDuplicateLetters(s.substring(pos + 1).replace("" + s.charAt(pos), ""));
    }
	
	public static void main(String[] args) {
		_316RemoveDuplicateLetters s = new _316RemoveDuplicateLetters();
		s.removeDuplicateLetters("cbacdcbc");
	}
}

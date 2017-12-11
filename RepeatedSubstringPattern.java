package leetcode;

public class RepeatedSubstringPattern {
	public static boolean repeatedSubstringPattern(String s) {
        for(int i = s.length()/2; i > 0; i--){
        	if(s.length() % i == 0){
        		for(int j = i; j < s.length(); j++){
        			if(s.charAt(j) != s.charAt(j % i))
        				break;
        			if(j == s.length()-1)
            			return true;
        		}
        	}
        }
        return false;
    }
	public static void main(String[] args) {
		repeatedSubstringPattern("ababab");
	}
}

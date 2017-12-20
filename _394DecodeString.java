package leetcode;
import java.util.*;

public class _394DecodeString {
	public String decodeString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<String> stString = new Stack<>();
        String cur = "";
        for(int i = 0; i < s.length(); i++) {
        		if(Character.isDigit(s.charAt(i))) {
        			int num = 0;
        			while(Character.isDigit(s.charAt(i))){
        				num *= 10;
        				num += (s.charAt(i++) - '0');
        			}
        			i--;
        			st.push(num);
        		}else if(Character.isAlphabetic(s.charAt(i))){
        			cur = cur + s.charAt(i);
        		}else if(s.charAt(i) == ']'){
        			int repeated = st.pop();
        			String str = stString.pop();
        			for(int k = 0; k < repeated; k++) {
        				str = str + cur;
        			}
        			cur = str;
        		}else if(s.charAt(i) == '[') {
        			stString.push(cur);
        			cur = "";
        		}
        }
        return cur;
    }
	
	public static void main(String[] args) {
		_394DecodeString s = new _394DecodeString();
		s.decodeString("2[abc]3[cd]ef");
	}
}

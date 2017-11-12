package leetcode;
import java.util.*;
public class DecodeString {
	 public static String decodeString(String s) {
		 Stack<String> st = new Stack<String>();
		 Stack<Integer> st2 = new Stack<Integer>();
		 String s1 = new String();
		 int i = 0;
		 while(i < s.length()){
			int n = 0;
			if(s.charAt(i) <= '9'&&s.charAt(i) >= '0'){
				n = 0;
				while(s.charAt(i) <= '9'&&s.charAt(i) >= '0'){
					n = n*10 +s.charAt(i) - '0';
					i++;
				}
				st2.push(n);
			}else if(s.charAt(i) == '['){
				i++;
				st.push(s1);
				s1 = "";
			}else if(s.charAt(i) == ']'){
				String temp = new String(st.pop());
				n = st2.pop();
				for(int j = 0; j < n; j++){
					temp = temp + s1;
				}
				s1 = temp;
				i++;
			}else{
				s1 = s1 + s.charAt(i);
				i++;
			}
		 }
		 return s1;
	 }
	 
	 public static void main(String[] args) {
		String s = "100[leetcode]";
		System.out.println(decodeString(s));
	}
}

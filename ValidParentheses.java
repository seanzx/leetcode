package leetcode;

import java.util.*;
public class ValidParentheses {
	public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        int i = 0;
        while(i < s.length()){
        	char c = s.charAt(i++);
        	switch(c){
        	case '(': st.push(c); break;
        	case '[': st.push(c); break;
        	case '{': st.push(c); break;
        	case ')': if(st.isEmpty() || st.peek() != '(') return false;
        				else st.pop();break; 
        	case ']': if(st.isEmpty() || st.peek() != '[') return false;
        				else st.pop(); break;
        	case '}': if(st.isEmpty() || st.peek() != '{') return false;
        				else st.pop(); break;
        	}
        }
        if(st.isEmpty())
        	return true;
        else return false;
    }
	public static void main(String[] args) {
		System.out.println(isValid("()"));
	}
}

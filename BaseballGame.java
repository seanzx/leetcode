package leetcode;

import java.util.*;
public class BaseballGame {
	 public static int calPoints(String[] ops) {
		 Stack<Integer> st = new Stack<Integer>(); 
	     for(int i = 0; i < ops.length; i++){
	    	if(ops[i].equals("C")){
	    		st.pop();
	    	}
	    	else if(ops[i].equals("+")){
	    		int x = st.pop();
	    		int y = st.pop();
	    		st.push(y);
	    		st.push(x);
	    		st.push(x+y);	    
	    	}
	    	else if(ops[i].equals("D")){
	    		st.push(st.peek()*2);
	    	}
	    	else{
	    		
	    		st.push(Integer.valueOf(ops[i]));
	    	}
	    	
	     }
	     int sum = 0;
	     while(!st.isEmpty())
	    	 sum += st.pop();
	     return sum;
	 }
	 public static void main(String[] args) {
		String[] ops = {"5","2","C","D","+"};
		System.out.println(calPoints(ops));
	}
}

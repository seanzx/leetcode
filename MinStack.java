package leetcode;
import java.util.*;

public class MinStack {
	 Stack<Integer> s;
	 int min = Integer.MAX_VALUE;
	 
	 public MinStack() {
		s = new Stack<Integer>();
	 }
	    
	 public void push(int x) {
	     if(x <= min){
	    	 s.push(min);
	    	 min = x;
	     }
	     s.push(x);
	 }
	    
     public void pop() {
    	if(s.isEmpty())
    		return ;
    	if(s.pop() == min){
    		min = s.pop();
    	}
     }
	    
     public int top() {
	     return s.peek(); 
     }
	    
     public int getMin() {
    	 return min;
     }
     
     public static void main(String[] args) {
		MinStack st = new MinStack();
		st.push(-2);
		st.push(0);
		st.push(-3);
		st.getMin();
		st.pop();
		st.top();
		System.out.println(st.getMin());
	}
}

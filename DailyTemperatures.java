package leetcode;
import java.util.*;
public class DailyTemperatures {
	public static int[] dailyTemperatures(int[] temperatures) {
		Stack<Integer> st = new Stack<>(); 
		int[] result = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
        	if(st.isEmpty() || temperatures[st.peek()] >= temperatures[i]){
        		st.push(i);
        	}
        	else{
        		while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i]){
        			int x = st.pop();
        			result[x] = i - x;
        		}
        	st.push(i);
        	}
        }
		return result;
    }
	public static void main(String[] args) {
		int[] temperatures = {73,74,75,71,69,72,76,93};
		dailyTemperatures(temperatures);
	}
}

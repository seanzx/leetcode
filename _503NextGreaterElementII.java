package leetcode;
import java.util.*;

public class _503NextGreaterElementII {
	public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] index = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
        		index[i] = -1;
        }
        for(int i = 0; i < nums.length * 2; i++) {
        		if(st.isEmpty()) {
        			st.push(i%nums.length);
        		}else {
        			if(nums[i%nums.length] <= nums[st.peek()]) {
        				st.push(i%nums.length);
        			}else {
        				while(!st.isEmpty() && nums[st.peek()] < nums[i%nums.length]) {
        					index[st.pop()] = nums[i%nums.length];
        				}
        				st.push(i%nums.length);
        			}
        		}
        }
        
        return index;
    }
	
	public static void main(String[] args) {
		_503NextGreaterElementII s = new _503NextGreaterElementII();
		int[] nums = new int[] {1,2,3,4,5,6,5,4,5,1,2,3};
		s.nextGreaterElements(nums);
	}
}

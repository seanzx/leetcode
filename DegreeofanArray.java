package leetcode;

import java.util.*;
public class DegreeofanArray {
	public static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> num = new HashMap<Integer, Integer>();
        Map<Integer, Integer> start = new HashMap<Integer, Integer>();
        Map<Integer, Integer> end = new HashMap<Integer, Integer>();
        int max = 0;
        int shortest = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
        	if(!num.containsKey(nums[i])){
        		num.put(nums[i], 1);
        		start.put(nums[i], i);
        		end.put(nums[i], i);
        	}
        	else{
        		num.put(nums[i], num.get(nums[i]) +1 );
        		end.put(nums[i], i);
        	}
        	max = Math.max(num.get(nums[i]), max);
        }
        for(int key:num.keySet()){
        	if(num.get(key) == max){
        		shortest = Math.min(shortest, end.get(key) - start.get(key));
        	}
        }
        return shortest+1;
    }
	public static void main(String[] args) {
		int[] nums ={1};
		System.out.println(findShortestSubArray(nums));
	}
}

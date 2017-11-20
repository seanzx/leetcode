package leetcode;

import java.util.*;
public class CombinationSumIV {
	public static int combinationSum4(int[] nums, int target) {
		int[] sum = new int[target+1];
		sum[0] = 1;
        for(int i= 1; i <= target; i++){
        	for(int j = 0; j < nums.length; j++){
        		if(nums[j] <= i)
        			sum[i] = sum[i- nums[j]] + sum[i];
        	}
        }
        return sum[target];
    }
	public static void main(String[] args) {
		
		int[] nums = {1,2,3};
		System.out.println(combinationSum4(nums, 4));
	}
}

package leetcode;

import java.util.Arrays;

public class PartitiontoKEqualSumSubsets {
	public static boolean canPartitionKSubsets(int[] nums, int k) {
		if(k == 1)
			return true;
		if(k > nums.length)
			return false;
		int sum = 0;
        for(int i = 0; i < nums.length; i++){
        	sum += nums[i];
        }
        if(sum%k != 0)
        	return false;
		sum = sum/k;
		Arrays.sort(nums);
        int[] subsetSum = new int[k];
        
        boolean[] taken = new boolean[nums.length];
		return  Partition(nums, sum, subsetSum, taken, 0, k);
	}
        
	public static boolean Partition(int[] nums, int sum, int[] subsetSum, boolean[] taken, int current, int k) { 
		if(subsetSum[current] == sum){
			if(current == k -1 )
				return true;
			else return Partition(nums, sum, subsetSum, taken, current + 1, k);
		}
		for(int i = nums.length - 1; i >= 0; i--){
			if(nums[i] > sum)
				return false;
			if(taken[i])
				continue;
			if(subsetSum[current] + nums[i] <= sum){
				taken[i] = true;
				subsetSum[current] = subsetSum[current] + nums[i];
				boolean next = Partition(nums, sum, subsetSum, taken, current, k);
				if(next)
					return true;
				taken[i] = false;
				subsetSum[current] -= nums[i];
			}
		}
		return false;
    }
	
	public static void main(String[] args) {
		int[] nums = {4,3,2,3,5,2,1};
		System.out.println(canPartitionKSubsets(nums, 4));
	}
}

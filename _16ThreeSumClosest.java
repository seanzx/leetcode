package leetcode;

import java.util.Arrays;

public class _16ThreeSumClosest {
	public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
		for(int i = 0; i < nums.length - 2; i++) {
			int left = i+1; 
			int right = nums.length - 1;
			
			while(left < right) {
				int sum = nums[i] + nums[right] + nums[left];
				closest = Math.abs(target - sum) < Math.abs(target - closest) ? sum : closest;
				if(nums[left] + nums[right] < target - nums[i]) {
					left++;
				}else if (nums[left] + nums[right] > target - nums[i]) {
					right--;
				}else 
					return target;
			}
		}
		return closest;
    }
}

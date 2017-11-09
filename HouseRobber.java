package leetcode;

public class HouseRobber {
	public int rob(int[] nums) {
		int[][] value = new int[nums.length+1][2];
        for(int i = 1; i < nums.length; i++){
        	value[i][0] = Math.max(value[i-1][0], value[i-1][1]);
        	value[i][1] = value[i-1][0] + nums[i];
        }
		return Math.max(value[nums.length][0], value[nums.length][1]);
    }
}

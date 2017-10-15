package leetcode;

public class PredicttheWinner {
	public static boolean PredictTheWinner(int[] nums) {
		if(nums.length == 0)
			return true;
        int[][] dp = new int[nums.length][nums.length];
        player(nums, 0, nums.length-1, dp);
        return dp[0][nums.length-1] >= 0? true:false;

    }
	public static int player(int[] nums, int s, int e, int[][] dp){
		if(s>e)
			return 0;
		dp[s][e] = s==e ? nums[s]:Math.max(nums[e] - player(nums, s, e-1, dp), nums[s] - player(nums, s+1, e, dp));
		return dp[s][e];
	}
	
	public static void main(String[] args) {
		int[] nums = {1};
		System.out.println(PredictTheWinner(nums));
	}
}

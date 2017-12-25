package leetcode;

public class _312BurstBalloons {
	public int maxCoins(int[] nums) {
		if(nums.length == 0)
			return 0;
		int[][] dp = new int[nums.length][nums.length];
		
	
		for(int s = 0; s < nums.length; s++) {
			for(int i = 0; i < nums.length - s; i++) {
				int j = i+s;
				for(int k = i; k <= j; k++) {
					dp[i][j] = Math.max(dp[i][j], (k-1 >= i? dp[i][k-1]:0) + (k+1 <= j ? dp[k+1][j]:0) + nums[k] * (i-1 >= 0 ? nums[i-1] : 1) * (j+1 < nums.length ? nums[j+1] : 1));
				}
			}
		}
		 
		 
		return dp[0][nums.length - 1];
    }
	
	public static void main(String[] args) {
		int[] nums = new int[] {3,1,5};
		_312BurstBalloons s = new _312BurstBalloons();
		s.maxCoins(nums);
	}
}

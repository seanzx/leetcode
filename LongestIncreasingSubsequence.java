package leetcode;

public class LongestIncreasingSubsequence {
	  public static int lengthOfLIS(int[] nums) {
		  if(nums.length == 0)
	            return 0;
		  int[] increasing = new int[nums.length];
		  increasing[0] = 1;
		  int[] none = new int[nums.length];
		  for(int i = 1; i < nums.length; i++){
			  increasing[i] = 1;
			  for(int j = i-1; j >= 0; j--){
				  	if(nums[j] < nums[i]){
				  		increasing[i] = Math.max(increasing[j]+1, increasing[i]);
				  	}
			  }
			  none[i] = Math.max(increasing[i-1], none[i-1]);
		  } 
		  return Math.max(increasing[nums.length-1], none[nums.length-1]);
	  }
	  
	  public static void main(String[] args) {
		int[] nums = {10,9,2,5,3,7,101,18};
		System.out.println(lengthOfLIS(nums));
		  
	}
}

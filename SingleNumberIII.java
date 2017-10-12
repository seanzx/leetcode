package leetcode;

public class SingleNumberIII {
	 public static  int[] singleNumber(int[] nums) {
		 int x = 0;
		 for(int i = 0; i < nums.length; i++){
			x = x ^ nums[i];
		 }
		 x = x & -x;
		 
		 int[] r = {0,0};
		 for(int i = 0; i < nums.length; i++){
			if((x & nums[i]) == 2){
				r[0] = r[0] ^ nums[i];
			}
			else
				r[1] = r[1] ^ nums[i];
			
		 }	 
		 return r;
	 }
	 
	public static void main(String[] args) {
		int[] nums = {0,0,1,2};
		int[] r = singleNumber(nums);
		System.out.println(r[0]+" "+r[1]);
	}
}

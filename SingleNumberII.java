package leetcode;

public class SingleNumberII {
	 public static int singleNumber(int[] nums) {
		 int[] x = new int[32];
		 for(int i = 0; i < nums.length; i++){
			 int j = 0;
			 while(nums[i] != 0){
				 x[j] += nums[i]%2;
				 nums[i] = nums[i]/2;
				 j++;
			 }
		 }
		 int num = 0;
		 for(int i = 0; i < 32; i++){
			 System.out.println(x[i]);
			 if((x[i]+3) % 3 == 1||x[i]+3 % 3 == -1){
				 num += Math.pow(2, i);
			 }
		//	 if(x[i] % 3 == -1){
		//		 num -= Math.pow(2, i);
		//	 }
		 }
		 return num;
	 }
	 
	 public static void main(String[] args) {
		int[] nums = {43,16,45,89,45,-2147483648,45,2147483646,-2147483647,-2147483648,43,2147483647,-2147483646,-2147483648,89,-2147483646,89,-2147483646,-2147483647,2147483646,-2147483647,16,16,2147483646,43};
		 System.out.println(singleNumber(nums));
	}
}

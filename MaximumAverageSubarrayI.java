package leetcode;

public class MaximumAverageSubarrayI {
	public static double findMaxAverage(int[] nums, int k) {
		int sum = 0;
        for(int i = 0; i < k; i++){
        	sum += nums[i];
        }
        int max = sum;
        for(int i = 1; i <= nums.length-k; i++){
        	sum += nums[i+k-1] - nums[i-1];
        	max =Math.max(max, sum);
        }
        return (double)max/k;
    }
	
	public static void main(String[] args) {
		int[] a ={0,4,0,3,2};
		System.out.println(findMaxAverage(a, 1));
	}
}

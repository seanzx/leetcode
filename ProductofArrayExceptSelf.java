package leetcode;

import java.lang.reflect.Array;

public class ProductofArrayExceptSelf {
	public static int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        int temp = 1;
        int temp2 = 1;
        for(int i = 0; i < nums.length; i++){
        	product[i] = 1;
        }
		for(int i = 0; i < nums.length; i++){
			
			product[i] *= temp;
			temp *= nums[i];
			product[nums.length - i -1] *= temp2;
			temp2 *= nums[nums.length - i - 1];
		}
		return product;
    }
	public static void main(String[] args) {
		int[] nums = {1,0};
		System.out.println(productExceptSelf(nums));
	}
}

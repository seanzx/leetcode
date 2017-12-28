package leetcode;

public class _360SortTransformedArray {
	public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
		int[] res = new int[nums.length];
		if(a > 0 || (a == 0 && b >= 0)) {
			for(int i = 0, j = nums.length - 1, k = nums.length - 1; i <= j;) {
				int x = function(nums[i], a, b, c) ;
				int y = function(nums[j], a, b, c) ;
				if(x >= y) {
					res[k--] = x;
					i++;
				}else {
					res[k--] = y;
					j--;
				}
			}
		}else if(a < 0 || (a == 0 && b < 0)) {
			for(int i = 0, j = nums.length - 1, k = 0; i <= j;) {
				int x = function(nums[i], a, b, c) ;
				int y = function(nums[j], a, b, c) ;
				if(x <= y) {
					res[k++] = x;
					i++;
				}else {
					res[k++] = y;
					j--;
				}
			}
		}
		return res;
    }
	
	public int function(int num, int a, int b, int c) {
		return num * num * a + b * num + c;
	}
}

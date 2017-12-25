package leetcode;

public class _747LargestNumberGreaterThanTwiceofOthers {
	public int dominantIndex(int[] nums) {
		if(nums.length == 0)
			return -1;
		if(nums.length == 1)
			return 0;
		int max = nums[0] > nums[1] ? 0 : 1;
		int second_max = nums[0] <= nums[1] ? 0 : 1;
		for(int i = 2; i < nums.length; i++) {
			if(nums[i] > nums[max]) {
				second_max = max;
				max = i;
			}else if(nums[i] > nums[second_max]) {
				second_max = i;
			}
		}
		return nums[max]/2 >= nums[second_max] ? max : -1;
		
    }
	
	public static void main(String[] args) {
		_747LargestNumberGreaterThanTwiceofOthers s = new _747LargestNumberGreaterThanTwiceofOthers();
		s.dominantIndex(new int[] {0,0,3,2});
		
	}
}

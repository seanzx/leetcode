package leetcode;

public class _34SearchforaRange {
	public int[] searchRange(int[] nums, int target) {
		int[] result = {-1, -1};
		int x = binearysearch(nums, target, true);
		if(x == nums.length || nums[x] != target) {
			return result;
		}else {
			result[0] = x;
			x  = binearysearch(nums, target, false);
			result[1] = x;
			return result;
		}
	}
	
	public int binearysearch(int[] nums, int target, boolean left) {
		int l = 0;
		int r = nums.length;
		int mid = 0;
		while(l < r) {
			mid = (l + r)/2;
			if(left && nums[mid] == target || nums[mid] > target) {
				r = mid;
			}else {
				l = mid + 1;
			}
		}
		return l;
	}
}

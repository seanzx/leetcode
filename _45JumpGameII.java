package leetcode;

public class _45JumpGameII {
	public int jump(int[] nums) {
		if(nums.length == 0)
			return 0;
		int step = 0;
		
		int farest = 0;
		int cur = farest;
		for(int i = 0; i < nums.length; i++) {
			if(i > farest) {
				step++;
				farest = cur;
			}
			cur = Math.max(cur, nums[i] + i);
		}
		return step;
    }
	
	public static void main(String[] args) {
		_45JumpGameII s = new _45JumpGameII();
		s.jump(new int[] {1,2});
	}
}

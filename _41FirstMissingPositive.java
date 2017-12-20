package leetcode;

public class _41FirstMissingPositive {
	public int firstMissingPositive(int[] nums) {
        
		for(int i = 0; i < nums.length; i++) {
			int cur = i;
			
			while(nums[cur] < nums.length && nums[cur] > 0 && nums[cur] != cur + 1 && nums[nums[cur] - 1] != nums[cur]) {
				int next = nums[cur] - 1;
				int temp = nums[cur];
				nums[cur] = nums[next];
				nums[next] = temp;
			}
			
		}
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != i+1)
				return i;
		}
		
		return nums.length + 1;
    }
	
	public static void main(String[] args) {
		_41FirstMissingPositive s = new _41FirstMissingPositive();
		s.firstMissingPositive(new int[] {1,1});
	}
}

package leetcode;

public class RemoveDuplicatesfromSortedArray {
	 public int removeDuplicates(int[] nums) {
		 int num = 0;
		 for(int i = 0; i <nums.length;){
			int temp = nums[i];
			num++;
			nums[num] = nums[i];
			while(i < nums.length &&temp == nums[i]){
				i++;
			}
		 }
		 return num;
	 }
}

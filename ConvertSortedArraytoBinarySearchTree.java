package leetcode;

public class ConvertSortedArraytoBinarySearchTree {
	 public static TreeNode sortedArrayToBST(int[] nums) {
		 if(nums.length == 0)
			 return null;
		 int mid = (nums.length-1)/2;
		 TreeNode root = new TreeNode(nums[mid]);
		 root.left = sortedArray(nums, 0, mid-1);
		 root.right = sortedArray(nums, mid+1, nums.length-1);
		 return root;
	 }
	 public static TreeNode sortedArray(int[] nums, int left, int right) {
		 if(left > right)
			 return null;
		 if(left == right)
			 return new TreeNode(nums[left]);
		 TreeNode root = new TreeNode(nums[(left + right)/2]);
		 root.left = sortedArray(nums, left, (left + right)/2-1);
		 root.right =  sortedArray(nums, (left + right)/2+1, right);
		 return root;
	 }
	 public static void main(String[] args) {
		int[] nums = {0};
		System.out.println(sortedArrayToBST(nums));
	}
}

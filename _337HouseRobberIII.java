package leetcode;

public class _337HouseRobberIII {
	public int rob(TreeNode root) {
		int[] res = DFS(root);
		return Math.max(res[0], res[1]);
		
    }
	
	public int[] DFS(TreeNode root) {
		if(root == null)
			return new int[] {0, 0};
		int[] left = DFS(root.left);
		int[] right = DFS(root.right);
		
		int max = Math.max(Math.max(left[0] + right[1], left[1] + right[0]), Math.max(left[1] + right[1], left[0] + right[0]));
		return new int[] {max, left[0] + right[0] + root.val};
	}
}

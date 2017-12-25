package leetcode;

public class _298BinaryTreeLongestConsecutiveSequence {
	int maxLen = 0;
	public int longestConsecutive(TreeNode root) {
        DFS(root);
        return maxLen;
    }
	
	public int DFS(TreeNode root) {
		if(root == null)
			return 0;
		
		int left = DFS(root.left);
		int right = DFS(root.right);
		int max = 1;
		if(root.left != null && root.val + 1 == root.left.val) {
			max = Math.max(max, left + 1);
		}
		if(root.right != null && root.val + 1 == root.right.val) {
			max = Math.max(max, right + 1);
		}
		maxLen = Math.max(max, maxLen);
		return max;
	}
}

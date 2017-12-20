package leetcode;

public class _98ValidateBinarySearchTree {

	public boolean isValidBST(TreeNode root) {
        return DFS(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
	
	public boolean DFS(TreeNode root, int min, int max) {
		if(root == null) {
			return true;
		}
		if(root.val <= min || root.val >= max) {
			return false;
		}

		return DFS(root.left, min, root.val) && DFS(root.right, root.val, max);
		
	}
}

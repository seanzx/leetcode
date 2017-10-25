package leetcode;

public class KthSmallestElementinaBST {
	int num = 0;
	int m = 0;
	public int kthSmallest(TreeNode root, int k) {
        inoder(root, k);
        return m;
    }
	
	public void inoder(TreeNode root, int k){
		if(num == k){
			return ;
		}
		if(root.left != null)
			inoder(root.left, k);
		num++;
		if(num == k){
			m = root.val;
			return ;
		}
		if(root.right != null)
			inoder(root.right, k);
	}
}

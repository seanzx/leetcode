package leetcode;

public class LowestCommonAncestorofaBinarySearchTree {
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		TreeNode temp = root;
	    while(temp.val > q.val && temp.val > p.val||temp.val < q.val && temp.val < p.val){
	    	if(temp.val > q.val && temp.val > p.val)
	    	   temp = temp.left;
	    	else if(temp.val < q.val && temp.val < p.val)
	    		temp = temp.right; 
		}
	    return temp;
    }
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
		root.left.left.left = new TreeNode(1);
		System.out.println(lowestCommonAncestor(root, root.left.left.left, root.left.right).val);
	}
}

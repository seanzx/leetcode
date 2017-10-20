package leetcode;

public class SymmetricTree {
	public static boolean isSymmetric(TreeNode root) {
        if(root == null)
        	return true;
        else if(root.left != null && root.right != null){
        	return same(root.left, root.right);
        }
        else if(root.left == null && root.right == null){
        	return true;
        }
        else return false;
    }
	
	public static boolean same(TreeNode left, TreeNode right){
		if(right.val != left.val)
			return false;
		boolean x = false;
		if(right.left == null && left.right != null){
			return false;
		}
		else if(right.left != null && left.right == null){
			return false;
		}
		else if(right.left != null && left.right != null){
			x = same(left.right, right.left);
		}
		else{
			x = true;
		}
		if(right.right == null && left.left != null){
			return false;
		}
		else if(right.right != null && left.left == null){
			return false;
		}
		else if(right.right != null && left.left != null){
			x = x&same(left.left, right.right);
		}
		else{
			x = x&true;
		}
		return x;
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left =new TreeNode(3);
		root.right.right = new TreeNode(3);
		System.out.println(isSymmetric(root));
	}
}

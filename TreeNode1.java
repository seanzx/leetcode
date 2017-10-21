package leetcode;

public class TreeNode1 {
	int val;
	TreeNode1 left;
	TreeNode1 right;
	TreeNode1(int x){
		val = x;
	}
	static TreeNode1 mergeTrees(TreeNode1 t1,TreeNode1 t2){
		if(t1 == null && t2 == null) return null;
			
		int val = (t1 == null ? 0:t1.val) + (t2 == null ? 0:t2.val);
		    TreeNode1 newNode = new TreeNode1(val);
		    newNode.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null :t2.left);
		    newNode.right= mergeTrees(t1 == null ? null: t1.right, t2 ==null ? null :t2.right);
		        
		    return newNode;
		} 
	
	static boolean printTrees(TreeNode1 t){
		if(t != null) System.out.printf("%d",t.val);
			else return false;
		printTrees(t.left);
		printTrees(t.right);	
		return true;
	}
	
	public static void main(String[] args) {
		TreeNode1 t1 = new TreeNode1(1);
		TreeNode1 t2 = new TreeNode1(3);
		TreeNode1 t3 =  mergeTrees(t1,t2);
		printTrees(t3);
	}
}

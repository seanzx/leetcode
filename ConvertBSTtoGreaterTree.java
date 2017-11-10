package leetcode;
import java.util.*;

public class ConvertBSTtoGreaterTree {
	public static TreeNode convertBST(TreeNode root) {
		
        List<TreeNode> l = new ArrayList<TreeNode>();

        T(root, l);
        int[] num = new int[l.size()];
        for(int i = 0; i < l.size(); i++){
        	num[i] = l.get(i).val;
        }
        for(TreeNode t : l){
        	for(int i = 0; i < num.length; i++){
        		if(t.val < num[i]){
        			t.val += num[i];
        		}
        	}
        }
        return root;
    }	
	
	public static void  T(TreeNode root, List<TreeNode> l){
		if(root == null){
			return ;
		}
		l.add(root);
		T(root.left, l);
		T(root.right, l);
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		convertBST(root);
		
	}
}

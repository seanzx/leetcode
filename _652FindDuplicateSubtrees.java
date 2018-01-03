package leetcode;
import java.util.*;
public class _652FindDuplicateSubtrees {
	Map<String, Integer> count;
	List<TreeNode> res;
	public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        count = new HashMap();
        res = new ArrayList();
        collect(root);
        return res;
    }
	
	public String collect(TreeNode root) {
		if(root == null) {
			return "#";
		}
		String cur = root.val + "," + collect(root.left) + "," + collect(root.right);
		if(!count.containsKey(cur)) {
			count.put(cur, 1);
		}else {
			if(count.get(cur) == 1) {
				count.put(cur, 2);
				res.add(root);
			}
		}
		
		return cur;
	}
}

package leetcode;
import java.util.*;
public class _331VerifyPreorderSerializationofaBinaryTree {
	public boolean isValidSerialization(String preorder) {
		Stack<String> st = new Stack<>();
        int i = 0;
        String[] node = preorder.split(",");
        while(i < node.length - 1) {
	        while(i < node.length && !node[i].equals("#")) {
	        		st.push(node[i]);
	        		i ++;
	        }
	        i ++;
	        if(i >= node.length || st.isEmpty()) {
	        		return false;
	        }else {
	        		st.pop();
	        }
        }
        if(!node[i].equals("#") || !st.isEmpty())
        		return false;
        return true;
    }
	public static void main(String[] args) {
		_331VerifyPreorderSerializationofaBinaryTree s = new _331VerifyPreorderSerializationofaBinaryTree();
		s.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#");
	}
}

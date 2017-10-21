package leetcode;
import java.util.*;
public class MaximumBinaryTree {
	static TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 0) return null;
        int max = nums[0];
        int maxNum =0;
        int i=0;
        for(i = 0;i < nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxNum=i;
            }
        }
        TreeNode t = new TreeNode(max);
        System.out.println(max);
        if(maxNum>0){
            int[] newdata1 = Arrays.copyOfRange(nums,0,maxNum);
            System.out.println(Arrays.toString(newdata1));
            t.left = constructMaximumBinaryTree(newdata1);
        }
        if(maxNum<nums.length-1){
           int[] newdata2 = Arrays.copyOfRange(nums,maxNum+1,nums.length);
           t.right = constructMaximumBinaryTree(newdata2); 
        }
        return t;
	}
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		constructMaximumBinaryTree(nums);
	}
}

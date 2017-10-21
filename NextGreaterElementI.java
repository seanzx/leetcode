package leetcode;
import java.util.Arrays;

public class NextGreaterElementI {
	public static void main(String[] args) {
		int[] findNums = {2,4,3,1}; 
		int[] nums = {1,3,2,4}; 
		int[] nextNums = new int[findNums.length];
		for(int i=0,j=0;i<findNums.length;i++,j=0){
			while(j < nums.length&&nums[j]!=findNums[i]) j++;
			while(j < nums.length&&nums[j] <= findNums[i]) j++;
			if(j==nums.length) nextNums[i] = -1;
			else nextNums[i] =nums[j];
			
		}
		System.out.println(Arrays.toString(nextNums));
	}
}

package leetcode;

import java.util.Arrays;

public class MaximumLengthofPairChain {
	 public static int findLongestChain(int[][] pairs) {
		 Arrays.sort(pairs, (a, b)-> a[1]>b[1]||a[1]==b[1]&&a[0]>b[0]? 1: -1);
		 int x = pairs[0][1];
		 int  num = 0;
		 for(int i = 0, j = 0; i < pairs.length; i = j){
			num++;
			j = i+1;
			while(j < pairs.length && pairs[j][0] <= x){
				j++;
			}
			if(j < pairs.length)
				x = pairs[j][1];
		 }
		return num; 
	 }
	 
	 public static void main(String[] args) {
		int[][] pairs = {{1,2},{2,3},{3,4}};
		System.out.println(findLongestChain(pairs));
	}
}

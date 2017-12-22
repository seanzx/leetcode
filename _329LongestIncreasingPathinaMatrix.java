package leetcode;

import java.util.Arrays;

public class _329LongestIncreasingPathinaMatrix {
	public int longestIncreasingPath(int[][] matrix) {
		if(matrix.length == 0 || matrix[0].length == 0)
            return 0;
	    int dp[][][] = new int[matrix.length][matrix[0].length][2]; 
	    int max = 0;
	    boolean change = true;
	
	    int[][] dirs = {{0,1}, {1, 0}, {0, -1}, {-1, 0}};
	    while(change) {
	        change = false;
	        for(int i = 0; i < matrix.length; i++) {
	        	for(int j = 0; j < matrix[0].length; j++) {
	                if(dp[i][j][0] == 0){
	                    dp[i][j][0] = 1;
	                    dp[i][j][1] = 1;
	                }
	        		int x = dp[i][j][0];
	        		int y = dp[i][j][1];
	        		for(int[] dir : dirs) {
	        			int x1 = dir[0] + i;
	        			int y1 = dir[1] + j;
	        			if(x1 < matrix.length && x1 >= 0 && y1 < matrix[0].length && y1 >= 0) {
	        				if(matrix[i][j] > matrix[x1][y1]) {
	        					dp[i][j][1] = Math.max(dp[i][j][1], dp[x1][y1][1] + 1);
	        				}else if(matrix[i][j] < matrix[x1][y1]) {
	        					dp[i][j][0] = Math.max(dp[i][j][0], dp[x1][y1][0] + 1);
	        				}	
	        			}
	        		}
	        	
	        		max = Math.max(max, Math.max(dp[i][j][0], dp[i][j][1]));
	        		if(x != dp[i][j][0] || y != dp[i][j][1])
	        			change = true;
	        	}
	        }
		}
	    return max;
    }
	public static void main(String[] args) {
		int[][] matrix = new int[][] {{1,6,12,1,3},{8,4,6,10,5},{12,11,7,12,2},{2,3,4,1,13},{14,6,0,14,13}};
		_329LongestIncreasingPathinaMatrix s = new _329LongestIncreasingPathinaMatrix();
		s.longestIncreasingPath(matrix);
	}
}

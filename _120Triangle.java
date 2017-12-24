package leetcode;
import java.util.*;
public class _120Triangle {
	public int minimumTotal(List<List<Integer>> triangle) {
		if(triangle.size() == 0)
			return 0;
        int[][] dp = new int[triangle.size()][triangle.size()];
		dp[0][0] = triangle.get(0).get(0); 
        
        for(int i = 1; i < dp.length; i++) {
        		dp[i][0] = dp[i-1][0] + triangle.get(i).get(0);
        		for(int j = 1; j < i; j++) {
        			dp[i][j] = Math.min(dp[i-1][j-1], dp[i-1][j]) + triangle.get(i).get(j);
        		}
        		dp[i][i] = dp[i-1][i-1] + triangle.get(i).get(i);
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < dp.length; i++) {
        		min = Math.min(min, dp[dp.length-1][i]);
        }
        return min;
    }
	
}

package leetcode;

import java.util.*;

public class _354RussianDollEnvelopes {
	public int maxEnvelopes(int[][] envelopes) {
		if(envelopes.length == 0 || envelopes[0].length == 0)
            return 0;
        int[] dp = new int[envelopes.length];
        int max = 1;
   
        Arrays.sort(envelopes, new Comparator<int[]>(){
            @Override
            public int compare(int[] e1, int[] e2){
                return Integer.compare(e1[0], e2[0]);
            }
        });
        dp[0] = 1;
        for(int i = 1; i < envelopes.length; i++) {
        		dp[i] = 1;
        		for(int j = 0; j < i; j++) {
        			if(envelopes[i][0] > envelopes[j][0] && envelopes[i][1] > envelopes[j][1]) {
        				dp[i] = Math.max(dp[j]+1, dp[i]);
        			}
        		}
        		max =Math.max(max, dp[i]);
        }
        return max;
    }
	
	public static void main(String[] args) {
		_354RussianDollEnvelopes s = new _354RussianDollEnvelopes();
		int[][] envelopes = new int[][] {{1,1}};
		System.out.println(s.maxEnvelopes(envelopes));
	}
}

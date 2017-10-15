package leetcode;

import java.util.*;
public class WordBreak {
	public static boolean wordBreak(String s, List<String> wordDict) {
		boolean[] dp = new boolean[s.length()+1]; 
		dp[0] = true;
        for(int i = 1; i <= s.length(); i++){
        	for(int j = 0; j < i; j++){
        		if(dp[j])
        		for(String st : wordDict){
        			if(st.equals(s.substring(j, i))){
        				dp[i] = true;
        				break;
        			}
        		}
        	}
        }
        return dp[s.length()];
    }
	public static void main(String[] args) {
		String s = "leetcode";
		List<String> wordDict = new ArrayList<String>();
		wordDict.add("leet");
		wordDict.add("code");
		System.out.println(wordBreak(s, wordDict));
	}
}

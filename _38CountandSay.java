package leetcode;

public class _38CountandSay {
	public String countAndSay(int n) {
		String res = "1";
        for(int i = 1; i < n; i++) {
        		String cur = "";
        		for(int j = 0; j < res.length(); j++) {
        			int k = 1;
        			while(j < res.length()-1 && res.charAt(j) == res.charAt(j+1)) {
        				k++;
        				j++;
        			}
        			
        			cur += String.valueOf(k) + res.charAt(j);
        		}
        		
        		res = cur;
        }
        return res;
    }
}

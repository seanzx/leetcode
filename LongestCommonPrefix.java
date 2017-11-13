package leetcode;

public class LongestCommonPrefix {
	 public String longestCommonPrefix(String[] strs) {
		 StringBuilder s = new StringBuilder();
		 StringBuilder s1 = new StringBuilder();
		 for(int i = 0; i < strs.length; i++){
			 if(i == 0){
				 s.append(strs[i]);
			 }
			 else{
				 int j = 0;
				 s1 = new StringBuilder();
				 while(j < Math.min(s.length(), strs[i].length()) && s.charAt(j) == strs[i].charAt(j)){
					 s1.append(s.charAt(j));
					 j++;
				 }
				 s = s1;
			 }
		 }
		 return s.toString();
	 }
}

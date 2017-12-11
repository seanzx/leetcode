package leetcode;

public class LicenseKeyFormatting {
	 public String licenseKeyFormatting(String S, int K) {
		 StringBuilder s = new StringBuilder();
		 for(int i = S.length()-1, j = 0;i >= 0;){
			 if(S.charAt(i) == '-'){
				 i--;
				 continue;
			 }
			 else{
				 if(j != K){
					 if(S.charAt(i) > 'Z'){
						 s.append((char)(S.charAt(i)- 'a' + 'A'));
					 }else
						 s.append(S.charAt(i));
					 j++;
					 i--;
				 }else{
					 s.append("-");
					 j = 0;
				 }
			 }
		 }
		 return s.reverse().toString();
	 }
}

package leetcode;

public class ImplementstrStr {
	public static int strStr(String haystack, String needle) {
		if(needle.length() == 0)
			return 0;
		if(haystack.length() == 0)
			return -1;
        int[] kmp = new int[needle.length()];
        int k = 0;
        for(int i = 1; i < needle.length(); i++){
        	while(k > 0 && needle.charAt(i) != needle.charAt(k))
        		k = kmp[k-1];
        	if(needle.charAt(i) == needle.charAt(k)){
        		k = k+1;
        	}
        	else
        		k = 0;
        	kmp[i] = k;
        }
        int j = 0;
        for(int i = 0; i < haystack.length();){
        	if(haystack.charAt(i) == needle.charAt(j)){
        		j++;
        		i++;
        	}
        	else{
        		while(j > 0 &&haystack.charAt(i) != needle.charAt(j))
        			j = kmp[j-1];
        		if(haystack.charAt(i) == needle.charAt(j)){
        			j++;
        			i++;
        		}
        		else{
        			i++;
        		}
        	}
        	if(j == needle.length())
        		return i - needle.length();
        }      
        return -1;
    }
	public static void main(String[] args) {
		System.out.println(strStr("mississippi", "pi"));
	}
}

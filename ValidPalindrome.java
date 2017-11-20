package leetcode;

public class ValidPalindrome {
	public static boolean isPalindrome(String s) {
        for(int i = 0, j = s.length()-1; i < j;){
        	while((i < j) &&!(s.charAt(i) <= '9'&&s.charAt(i) >= '0' || s.charAt(i) <= 'Z'&&s.charAt(i) >= 'A' || s.charAt(i) <= 'z'&&s.charAt(i) >= 'a'))
        		i++;
        	while((j > i)&&!(s.charAt(j) <= '9'&&s.charAt(j) >= '0' || s.charAt(j) <= 'Z'&&s.charAt(j) >= 'A' || s.charAt(j) <= 'z'&&s.charAt(j) >= 'a'))
        		j--;
        	if(s.charAt(i) <= '9'&&s.charAt(i) >= '0'&&(s.charAt(j) <= '9'&&s.charAt(j) >= '0')){
        		if(s.charAt(i) != s.charAt(j))
        			return false;
        	}
        	else if((s.charAt(j) <= 'Z'&&s.charAt(j) >= 'A' || s.charAt(j) <= 'z'&&s.charAt(j) >= 'a') && (s.charAt(i) <= 'Z'&&s.charAt(i) >= 'A' || s.charAt(i) <= 'z'&&s.charAt(i) >= 'a')){
        		if(!(s.charAt(i) == s.charAt(j) || s.charAt(i)+32 == s.charAt(j)|| s.charAt(j)+32 == s.charAt(i)))
        			return false;
        	}
        	else return false; 
        	if(j == i || j == i+1)
        		return true;
        }
        return true;
    }
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(".,"));
	}
}

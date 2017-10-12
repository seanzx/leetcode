package leetcode;

public class ReverseStringII {
	public static void main(String[] args) {
		String s = "abcdefg";
		int k =2;
	/*	String result = new String();
		for(int i = 0;i < s.length(); i += 2 * k){
			for(int j = i + k > s.length() ? s.length():i+k ; j > i; j--){
			  	result = result + s.charAt(j-1);
			  	System.out.println(result);
			}
			for(int j = i + k; j < i + 2 * k && j < s.length(); j++){
			  	result = result + s.charAt(j);
			  	System.out.println(result);
			}
		}
		System.out.println(result);*/
		char[] result = s.toCharArray();
		char temp;
		for(int i = 0;i < s.length(); i += 2 * k){
			for(int j = i + k > s.length() ? s.length():i+k ,m = i; j > m; j--, m++){
				temp = s.charAt( m );
			  	result[m] =  s.charAt(j-1);
			  	result[j-1] = temp;
			  	System.out.println(String.valueOf(result));
			}
		}
	}
}

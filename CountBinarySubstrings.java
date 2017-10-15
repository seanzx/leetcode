package leetcode;

public class CountBinarySubstrings {
	 public static int countBinarySubstrings(String s) {
		 int sum = 0;
	     for(int i = 0; i < s.length(); i++){
	    	 if(s.charAt(i) == '0'){
	    		 int numOfZero = 0;
	    		 int j = i;
	    		 while(j < s.length() &&s.charAt(j) == '0'){
	    			 numOfZero ++;
	    			 j++;
	    		 }
	    		 while(j < s.length() &&s.charAt(j) == '1'){
	    			 numOfZero --;
	    			 j++;
	    			 if(numOfZero == 0){
		    			 sum++;
		    			 break;
	    			 }
	    		 }
	    	 }
	    	 else if(s.charAt(i) == '1'){
	    		 int numOfOne = 0;
	    		 int j = i;
	    		 while(j < s.length() &&s.charAt(j) == '1'){
	    			 numOfOne ++;
	    			 j++;
	    		 }
	    		 while(j < s.length() &&s.charAt(j) == '0'){
	    			 numOfOne --;
	    			 j++;
	    			 if(numOfOne == 0){
		    			 sum++;
		    			 break;
	    			 }
	    		 }
	    	 } 
	     }
		 return sum;
	 }
	 public static void main(String[] args) {
		String s = "10101";
		System.out.println(countBinarySubstrings(s));
	}
}

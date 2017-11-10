package leetcode;

public class AddBinary {
	public static String addBinary(String a, String b) {
		int c = 0;
		int i = 0;
		StringBuilder s = new StringBuilder();
        for(i = 0; i < Math.min(a.length(), b.length()); i++){
        	int x = a.charAt(a.length()-1-i) + b.charAt(b.length()-1-i)-'0'-'0'+c;
        	if(x >= 2){
        		c = 1;
        		x = x%2;
        	}
        	else{
        		c = 0;
        	}
        	s.append(x == 1?'1':'0');
        }
		if(i < a.length()){
			for(; i < a.length(); i++){
				int x = a.charAt(a.length()-1-i) + c - '0';
				if(x == 2){
	        		c = 1;
	        		x = 0;
	        	}
	        	else{
	        		c = 0;
	        	}
	        	s.append(x == 1?'1':'0');
			}
		}
		else{
			for(; i < b.length(); i++){
				int x = b.charAt(b.length()-1-i) + c;
				if(x == 2){
	        		c = 1;
	        		x = 0;
	        	}
	        	else{
	        		c = 0;
	        	}
	        	s.append(x == 1?'1':'0');
			}
		}
		if(c == 1)
			s.append('1');
		s.reverse();
        return s.toString();
    }
	public static void main(String[] args) {
		String a = "1111";
		String b = "1111";
		System.out.println(addBinary(a, b));
	}
}

package leetcode;

public class BinaryNumberwithAlternatingBits {
	 public static boolean hasAlternatingBits(int n) {
		 int i = n&1;
		 int j = n>>1&1;
		 int k = 0;
		 if(i == j)
             return false;
		 while((n>>k)!=0){
			if(k%2 == 0){ 
				if((n>>k&1)!=i){
					return false;
				}
			}
			if(k%2 == 1){ 
				if((n>>k&1)!=j){
					return false;
				}
			}
			k++;
		 }
		 return true;
	 }
	 public static void main(String[] args) {
		System.out.println(hasAlternatingBits(3));
	}
}

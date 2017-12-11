package leetcode;

public class PowerofThree {
	 public static boolean isPowerOfThree(int n) {
		 if(n <= 0)
			 return false;
		 if(n == 1)
			 return true;
		 while(n != 1 || n != -1){
			 if(n%3 != 0)
				 return false;
			 n = n/3;
		 }
		 return true;
	 }
	 public static void main(String[] args) {
		System.out.println(isPowerOfThree(27));
	}
}

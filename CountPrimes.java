package leetcode;

public class CountPrimes {
	 public static int countPrimes(int n) {
		 boolean[] isPrimes = new boolean[n+1];
		 int sum = 0;
		 for(int i = 2; i < n; i++){
			 int j = 2;
			 if(isPrimes[i] == false){
				 sum++;
				 while(j*i < n){
					 isPrimes[j*i] = true;
					 j++;
				 }
			 }
		 }
		 return sum;
	 }
	 public static void main(String[] args) {
		System.out.println(countPrimes(2));
		 
	}
}

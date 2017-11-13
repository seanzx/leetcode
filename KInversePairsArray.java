package leetcode;

public class KInversePairsArray {
	 public static int kInversePairs(int n, int k) {
		 int mod = 1000000007;
		 int[][] numOfInversion = new int[n+1][k+1]; 
		 
		 if(k == 0|| k == n*(n-1)/2)
			 return 1;
		 if(k > n*(n-1)/2)
			 return 0;
		 for(int i = 1; i <= n; i++)
			 numOfInversion[i][0] = 1;
		 
		 for(int i = 1; i <= n ;i++){
			 for(int j = 1; j <= k; j++){
				 for(int m = 0; m <= Math.min(j, i-1); m++)
					  numOfInversion[i][j] += numOfInversion[i-1][j-m]; 
		                 
		                numOfInversion[i][j]= (mod+numOfInversion[i][j])%mod;
			 }
		 }
		 return numOfInversion[n][k];
	 }
	 public static void main(String[] args) {
		System.out.println(kInversePairs(1000, 1000));
	}
}

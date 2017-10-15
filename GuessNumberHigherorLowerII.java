package leetcode;
import java.util.Arrays;

public class GuessNumberHigherorLowerII {
	public static int getMoneyAmount(int n) {
		int[][]payment = new int[n+1][n+1];
		if(n == 1)
			return 0;
		for(int s = 1; s < n; s++){
			for(int i = 0; i <= n-s; i++){
				int j = i+s;
				payment[i][j] = Integer.MAX_VALUE;
				for(int k = i; k <= j; k++)
				payment[i][j] = Math.min(k + Math.max(k > 1 ? payment[i][k-1]:0, k+1<= j? payment[k+1][j]:0), payment[i][j]);
			}
		}
		return payment[1][n];
	}
	public static void main(String[] args) {
		System.out.println(getMoneyAmount((4)));
	}
}

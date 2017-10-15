package leetcode;

public class OutofBoundaryPaths {
	 public static int findPaths(int m, int n, int N, int i, int j) {
		  int[][][] dp = new int[N+1][m][n];
			 dp[0][i][j] = 1;
			 int[][] move = {{0,1},{0,-1},{1,0},{-1,0}};
			 int result = 0;
			 for(int numOfMoves = 1; numOfMoves <= N; numOfMoves++){
				 for(int x = 0; x < m; x++){
					 for(int y = 0; y < n; y++){
						 for(int[] z:move){
							int x1 = z[0] + x;
							int y1 = z[1] + y;
							if(x1<0 || x1>=m || y1< 0 || y1>=n){
								result = (result+dp[numOfMoves-1][x][y]);
							}
							else{
								dp[numOfMoves][x1][y1] = (dp[numOfMoves-1][x][y] + dp[numOfMoves][x1][y1]);
								
							}
						 }
					 }
				 }
			 }
			 return result;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(findPaths(2, 2, 2, 0, 0));
		 
	}
}

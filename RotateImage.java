package leetcode;

public class RotateImage {
	 public void rotate(int[][] matrix) {
		 int n = matrix.length;
		 int[][] temp = new int[n][n];
		 for(int i = 0; i < n; i++){
			 for(int j = 0; j < n; j++){
				 temp[i][j] = matrix[j][i];
			 }
		 }
		 for(int i = 0; i < n; i++){
			 for(int j = 0; j < n; j++){
				 matrix[i][j] = temp[i][n-j-1];
			 }
		 }
	 }
}

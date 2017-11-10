package leetcode;

public class KthSmallestElementinaSortetMatrix {
	public static int kthSmallest(int[][] matrix, int k){
		int n = matrix.length;
		int l = matrix[0][0];
		int r = matrix[n-1][n-1];
		while(l <= r){
			int mid = l + (r - l) / 2;
			int count = getLessNum(matrix, mid);
			if(count < k){
				l = mid + 1;
			}else{
				r = mid - 1;
			}
		}
		return l;
	}
	
	public static int getLessNum(int[][] matrix, int val){
		int res = 0;
		int n = matrix.length;
		int i = n-1;
		int j = 0;
		while(i >= 0 && j < n){
			if(val < matrix[i][j]){
				i--;
			}else{
				res += i+1;
				j++;
			}
		}
		return res;
	}
}

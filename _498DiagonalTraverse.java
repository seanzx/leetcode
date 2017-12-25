package leetcode;

public class _498DiagonalTraverse {
	public int[] findDiagonalOrder(int[][] matrix) {
		if(matrix.length == 0 || matrix[0].length == 0)
			return new int[0];
        int row = matrix.length;
        int col = matrix[0].length;
        
        int[] res = new int[row * col];
        int cur = 0;
        boolean up = false;
		for(int s = 0; s < row + col - 1; s++) {
			up = !up;
			if(up) {
				for(int i = s > row - 1 ? row - 1 : s; i >= 0 && s - i < col; i--) {
					int j = s - i;
					res[cur++] = matrix[i][j];
				}
			}else {
				for(int i = s > col - 1 ? s - col + 1 : 0; i <= s && i < row; i++) {
					int j = s - i;
					res[cur++] = matrix[i][j];
				}
			}
		}
		return res;
    }
	
	public static void main(String[] args) {
		int[][] matrix = new int[][] {{6,9,7}};
		_498DiagonalTraverse s = new _498DiagonalTraverse();
		s.findDiagonalOrder(matrix);
	}
}

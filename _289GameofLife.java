package leetcode;

public class _289GameofLife {
	public void gameOfLife(int[][] board) {
		if(board.length == 0 || board[0].length == 0) {
			return ;
		}
		int row = board.length;
		int col = board[0].length;
		int[][] next = new int[row][col];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				int live = 0;
				int dead = 0;
				if(i > 0 && j > 0) {
					if(board[i-1][j-1] == 1)
						live++;
					else 
						dead++;
				}
				if(i > 0) {
					if(board[i-1][j] == 1)
						live++;
					else 
						dead++;
				}
				if(i > 0 && j < col-1) {
					if(board[i-1][j+1] == 1)
						live++;
					else
						dead++;
				}
				if(j > 0) {
					if(board[i][j-1] == 1)
						live++;
					else
						dead++;
				}
				if(j < col-1) {
					if(board[i][j+1] == 1)
						live++;
					else 
						dead++;
				}
				if(i < row-1 && j > 0) {
					if( board[i+1][j-1] == 1)
						live++;
					else 
						dead++;
				}
				if(i < row-1) {
					if(board[i+1][j] == 1)
						live++;
					else
						dead++;
				}
				if(i < row-1 && j < col-1) {
					if(board[i+1][j+1] == 1)
						live++;
					else
						dead++;
				}
				
				if(board[i][j] == 0) {
					if(live == 3)
					next[i][j] = 1;
				}else {
					if(live < 2) {
						next[i][j] = 0;
					}else if(live < 4) {
						next[i][j] = board[i][j];
					}else {
						next[i][j] = 0;
					}
				}
			}
		}
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				board[i][j] = next[i][j];
			}
		}
    }
}

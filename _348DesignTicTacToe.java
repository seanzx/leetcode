package leetcode;

public class _348DesignTicTacToe {
	char[][] board;
	int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1},{1,1},{-1,-1},{-1,1},{1,-1}};
	public _348DesignTicTacToe(int n) {
		board = new char[n][n];
	}
	
	public int move(int row, int col, int player) {
		if(player == 1) {
    		board[row][col] = 'X';
    		int[] num = new int[8];
    		int i = 0;
    		for(int[] dir : dirs) {
    			int x = row;
    			int y = col;
    			while(x >= 0 && x < board.length && y >= 0 && y < board[0].length && board[x][y] == 'X') {
                    num[i]++;
    				x += dir[0];
    				y += dir[1];
    			}
    			i++;
    		}
    		if(num[0] + num[1]-1 == board.length || num[2] + num[3]-1 == board.length || num[4]+ num[5]-1 == board.length || num[6]+num[7]-1 == board.length) {
    			return 1;
    		}
    }else {
    		board[row][col] = 'O';
    		int[] num = new int[8];
    		int i = 0;
    		for(int[] dir : dirs) {
    			int x = row;
    			int y = col;
    			while(x >= 0 && x < board.length && y >= 0 && y < board[0].length && board[x][y] == 'O') {
    				x += dir[0];
    				y += dir[1];
    				num[i]++;
    			}
    			i++;
    		}
    		if(num[0] + num[1]-1 == board.length || num[2] + num[3]-1 == board.length || num[4]+ num[5]-1 == board.length || num[6]+num[7]-1 == board.length) {
    			return 2;
    		}
    }
    return 0;
    }
	public static void main(String[] args) {
		_348DesignTicTacToe s = new _348DesignTicTacToe(3);
		s.move(2, 0, 1);
		s.move(0, 0, 2);
		s.move(0, 1, 1);
		s.move(0, 2, 2);
		s.move(2, 1, 1);
		s.move(1, 1, 2);
	}
}

package leetcode;

public class _361BombEnemy {
	public int maxKilledEnemies(char[][] grid) {
		if(grid.length == 0 || grid[0].length == 0)
			return 0;
        int max = 0;
        int[][] dp = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++) {
        		int temp = 0;
        		for(int j = 0, k = 0; j <= grid[0].length; j++) {
        			if(j == grid[0].length || grid[i][j] == 'W'){
        				for(int m = k; m < j; m++) {
        					if(grid[i][m] == '0') {
        						dp[i][m] += temp;
        						max = Math.max(max, dp[i][m]);
        					}
        				}
                    temp = 0;
        				k = j+1;
        			}else if(grid[i][j] == 'E') {
        				temp++;
        			}
        		}
        }
        for(int i = 0; i < grid[0].length; i++) {
	    		int temp = 0;
	    		for(int j = 0, k = 0; j <= grid.length; j++) {
	    			if(j == grid.length || grid[j][i] == 'W'){
	    				for(int m = k; m < j; m++) {
	    					if(grid[m][i] == '0') {
		    					dp[m][i] += temp;
		    					max = Math.max(max, dp[m][i]);
	    					}
	    				}
                     temp = 0;
	    				k = j+1;
	    			}else if(grid[j][i] == 'E') {
	    				temp++;
	    			}
	    		}
        }
        return max;
    }
	public static void main(String[] args) {
		char[][] grid = new char[][] {{'0','E','0','0'},{'E','0','W','E'},{'0','E','0','0'}};
		_361BombEnemy s = new _361BombEnemy();
		s.maxKilledEnemies(grid);
	}
}

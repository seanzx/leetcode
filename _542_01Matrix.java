package leetcode;
import java.util.*;
public class _542_01Matrix {
	public int[][] updateMatrix(int[][] matrix) {
        Queue<int[]> q = new LinkedList<>();
        int[][] dirs = new int[][] {{0,1},{1,0},{0,-1},{-1,0}};
        for(int i = 0; i < matrix.length; i++) {
        		for(int j = 0; j < matrix[0].length; j++) {
        			if(matrix[i][j] == 0)
        				q.add(new int[] {i, j});
        		}
        }
        
        int[][] res = new int[matrix.length][matrix[0].length];
        int depth = 0;
        while(!q.isEmpty()) {
        		Queue<int[]> newq = new LinkedList<>();
        		while(!q.isEmpty()) {
        			int[] cur = q.poll();
        			
        			for(int[] dir : dirs) {
        				int x = dir[0] + cur[0];
        				int y = dir[1] + cur[1];
        				if(x >= 0 && y >= 0 && x < matrix.length && y < matrix[0].length && matrix[x][y] != 2) {
        					if(matrix[x][y] == 1) {
                				res[x][y] = depth + 1;
                			}
        					matrix[x][y] = 2;
        					newq.add(new int[] {x,y});
        				}
        			}
        		}
        		q = newq;
        		depth++;
        }
        return res;
    }
}

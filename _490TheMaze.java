package leetcode;
import java.util.*;
public class _490TheMaze {
	public boolean hasPath(int[][] maze, int[] start, int[] destination) {
		Stack<int[]> st = new Stack<>();
		st.push(start);
		boolean[][] visited = new boolean[maze.length][maze[0].length]; 
		while(!st.isEmpty()) {
			int[] cur = st.pop();
			visited[cur[0]][cur[1]] = true;
			
			if(cur[0] == destination[0] && cur[1] == destination[1]) {
				return true;
			}
			
			int[][] dirs = new int[][] {{1,0},{-1,0},{0,1},{0,-1}};
			for(int[] dir : dirs) {
				int x = cur[0] + dir[0];
				int y = cur[1] + dir[1];
				while(x >= 0 && x < maze.length && y>= 0 && y < maze[0].length && maze[x][y] == 0) {
					x += dir[0];
					y += dir[1];
				}
				if(!visited[x][y]) {
					st.push(new int[] {x, y});
				}
			}
		}
		return false;
    }
	
	public static void main(String[] args) {
		_490TheMaze s = new _490TheMaze();
		int[][] maze = new int[][] {{0,0,1,0,0},{0,0,0,0,0},{0,0,0,1,0},{1,1,0,1,1},{0,0,0,0,0}};
		
		int[] start = new int[] {0,4};
		int[] destination = new int[] {3,2};
		s.hasPath(maze, start, destination);
	}
}
